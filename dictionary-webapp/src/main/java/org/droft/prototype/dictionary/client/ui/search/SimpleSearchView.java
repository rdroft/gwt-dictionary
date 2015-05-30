package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestOracle;
import org.droft.prototype.dictionary.components.suggestbox.SuggestBox;
import org.gwtbootstrap3.client.ui.Container;

import java.util.List;

/**
 * Created by rpashniev on 29.05.2015.
 */
public class SimpleSearchView extends Composite implements SearchView{
    SearchPresenter searchPresenter;
    @Override
    public void setPresenter(SearchPresenter searchPresenter) {
        this.searchPresenter = searchPresenter;
    }

    @Override
    public void setSearchList(List<String> words) {
        MultiWordSuggestOracle m =(MultiWordSuggestOracle) wordSearch.getSuggestOracle();
        m.clear();
        m.addAll(words);
    }

    interface SimpleSearchViewUiBinder extends UiBinder<Container, SimpleSearchView> {
    }

    private static SimpleSearchViewUiBinder ourUiBinder = GWT.create(SimpleSearchViewUiBinder.class);

    @UiField(provided = true)
    SuggestBox wordSearch;

    public SimpleSearchView() {
        wordSearch = new SuggestBox();
        initWidget(ourUiBinder.createAndBindUi(this));
        wordSearch.getValueBox().addChangeHandler(new ChangeHandler() {
            @Override
            public void onChange(ChangeEvent event) {
               GWT.log("ON: "+wordSearch.getValueBox().getValue());
            }
        });
        wordSearch.addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                String v = event.getValue();
                GWT.log("xome:" + v + "  " + wordSearch.getText());
            }
        });

     wordSearch.addSelectionHandler(new SelectionHandler<SuggestOracle.Suggestion>() {
         @Override
         public void onSelection(SelectionEvent<SuggestOracle.Suggestion> event) {
             GWT.log("select:" + event.getSelectedItem().getDisplayString() + "  " + wordSearch.getValue());
         }
     });
    }


    protected void onLoad(){

    }
}