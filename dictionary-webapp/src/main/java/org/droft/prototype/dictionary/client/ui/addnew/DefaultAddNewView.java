package org.droft.prototype.dictionary.client.ui.addnew;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.inject.Inject;
import org.droft.prototype.dictionary.client.ui.search.SearchPlace;

/**
 * Created by rpashniev on 27.05.2015.
 */
public class DefaultAddNewView extends Composite implements AddNewView {
    interface DefaultAddNewViewUiBinder extends UiBinder<HTMLPanel, DefaultAddNewView> {
    }

    private static DefaultAddNewViewUiBinder ourUiBinder = GWT.create(DefaultAddNewViewUiBinder.class);
    @UiField
    RichTextArea someArea;
    @UiField
    Button goToSearch;

    @Inject
    PlaceController placeController;

    public DefaultAddNewView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    protected void onLoad(){
        goToSearch.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
               placeController.goTo(new SearchPlace("ddsfsdf"));
            }
        });
    }
}