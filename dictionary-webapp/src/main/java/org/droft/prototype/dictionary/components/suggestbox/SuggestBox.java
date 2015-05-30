package org.droft.prototype.dictionary.components.suggestbox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.SuggestOracle;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by rdroft on 5/29/15.
 */
public class SuggestBox extends org.gwtbootstrap3.client.ui.SuggestBox {
    EventWrapper eventWrapper ;

    public interface ValueAppliedListener {
        void valueApplied(String value);
    }

    public SuggestBox() {
        super();
        eventWrapper = new EventWrapper(this);
        eventWrapper.registerHandlers();
    }

    public void setValueAppliedListener(ValueAppliedListener appliedListener) {
        eventWrapper.setValueAppliedListener(appliedListener);
    }

    class EventWrapper {
        com.google.gwt.user.client.ui.SuggestBox box;
        EventWrapper(com.google.gwt.user.client.ui.SuggestBox box) {
         this.box = box;
        }

        private ValueAppliedListener valueAppliedListener;

        public void setValueAppliedListener(ValueAppliedListener appliedListener) {
            this.valueAppliedListener = appliedListener;
        }

        protected void fireEvent() {
            GWT.log("event: "+box.getValue());
            if(valueAppliedListener!=null)
             valueAppliedListener.valueApplied(getValue());
        }

        //originally GWT send an event before the actual value changed
        //FIX
        protected void registerHandlers() {
            addSelectionHandler(new SelectionHandler<SuggestOracle.Suggestion>() {
                @Override
                public void onSelection(SelectionEvent<SuggestOracle.Suggestion> event) {
                    String selected = event.getSelectedItem().getReplacementString();
                    ValueChangeEvent.fire(box, selected);
                }
            });
            addValueChangeHandler(new ValueChangeHandler<String>() {
                @Override
                public void onValueChange(ValueChangeEvent<String> event) {
                    Widget eventSource = (Widget)event.getSource();

                    if(box == eventSource && //check if the object that sourced the event is referentially the object we want to handle events for
                            !((DefaultSuggestionDisplay)box.getSuggestionDisplay()).isSuggestionListShowing()) {
                        fireEvent();
                    }
                }
            });
        }

    }

}
