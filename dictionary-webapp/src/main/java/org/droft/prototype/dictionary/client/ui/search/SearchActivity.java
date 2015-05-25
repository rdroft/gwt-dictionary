package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

/**
 * Created by rdroft on 5/25/15.
 */
public class SearchActivity extends AbstractActivity {
    @Inject
    SearchView searchView;
    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
         panel.setWidget(searchView);
    }
}
