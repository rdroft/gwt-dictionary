package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import org.droft.prototype.dictionary.client.ui.addnew.AddNewPlace;

import java.util.logging.Logger;

/**
 * Created by rdroft on 5/25/15.
 */
public class DefaultSearchView extends Composite implements SearchView{
    Logger logger = Logger.getLogger("NameOfYourLogger");

    interface DefaultSearchViewUiBinder extends UiBinder<HTMLPanel, DefaultSearchView> {
    }
    @Inject
    PlaceController placeController;
    @UiField
    TextBox textBox;
    @UiField
    Button goNextButton;
    private static DefaultSearchViewUiBinder ourUiBinder = GWT.create(DefaultSearchViewUiBinder.class);

    public DefaultSearchView() {
        initWidget(ourUiBinder.createAndBindUi(this));

    }

    public void sendEvent(){
        GWT.log("Try to send:"+placeController);
        placeController.goTo(new AddNewPlace("xx"));
        GWT.log("after send:"+placeController);
    }

    @Override
    protected void onLoad() {
        GWT.log("some message");
        goNextButton.setText("Super button");
        goNextButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                 goNextButton.setText(goNextButton.getText()+"!");
                GWT.log("before send message");
                sendEvent();
            }
        });
    }
}