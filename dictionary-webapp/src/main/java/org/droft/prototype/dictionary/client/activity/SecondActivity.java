package org.droft.prototype.dictionary.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import org.droft.prototype.dictionary.client.places.SecondPlace;
import org.droft.prototype.dictionary.client.ui.SecondView;

/**
 * Created by rdroft on 5/24/15.
 */
public class SecondActivity extends AbstractActivity {
    private String name;
    private SecondView view;
    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        //view.setName(name);
        //containerWidget.setWidget(view.asWidget());
    }
    public SecondActivity withPlace(SecondPlace place){
        return this;
    }
}
