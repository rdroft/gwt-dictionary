package org.droft.prototype.dictionary.client.ui.main;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.droft.prototype.dictionary.client.common.MainActivityMapper;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;

@Singleton
public class MainView extends Composite implements AcceptsOneWidget {

    private static MainViewUiBinder uiBinder = GWT
            .create(MainViewUiBinder.class);
    @UiField(provided = true)
    SimplePanel panel = new SimplePanel();


    //    @UiField(provided = true)
//    Widget contentWidget = new SimplePanel().getWidget();
//
    @Override
    public void setWidget(IsWidget isWidget) {
        if(isWidget!=null) {
            panel.setWidget(isWidget.asWidget());
        }else{
            panel.setWidget(null);
        }
    }


    interface MainViewUiBinder extends UiBinder<Widget, MainView> {
    }



    @Inject
    public MainView(MainActivityMapper mainActivityMapper,
                   DictionaryServiceAsync serviceAsync) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
