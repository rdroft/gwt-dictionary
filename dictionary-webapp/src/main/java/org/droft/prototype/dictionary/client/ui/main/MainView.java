package org.droft.prototype.dictionary.client.ui.main;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.droft.prototype.dictionary.client.common.MainActivityMapper;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;
import org.droft.prototype.dictionary.model.DictionaryReducedEntry;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

@Singleton
public class MainView extends Composite implements AcceptsOneWidget {

    private static MainViewUiBinder uiBinder = GWT
            .create(MainViewUiBinder.class);


    IsWidget content;
    @Override
    public void setWidget(IsWidget isWidget) {
          this.content = isWidget;
    }


    interface MainViewUiBinder extends UiBinder<Widget, MainView> {
    }


    @UiField(provided = true)
    TextArea textArea;
    @Inject
    public MainView(MainActivityMapper mainActivityMapper,
                    EventBus eventBus,DictionaryServiceAsync serviceAsync) {
        textArea = new TextArea();
        serviceAsync.getEntries(new MethodCallback<List<DictionaryReducedEntry>>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                SimplePanel s;
            }

            @Override
            public void onSuccess(Method method, List<DictionaryReducedEntry> dictionaryReducedEntries) {
                textArea.setText(dictionaryReducedEntries.size()+" ");
            }
        });

        initWidget(uiBinder.createAndBindUi(this));
        ActivityManager mainActivityManager = new ActivityManager(mainActivityMapper, eventBus);
    }
}
