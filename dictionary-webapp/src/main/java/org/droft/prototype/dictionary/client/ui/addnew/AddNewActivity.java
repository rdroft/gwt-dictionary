package org.droft.prototype.dictionary.client.ui.addnew;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import org.droft.prototype.dictionary.client.ui.search.SearchView;

/**
 * Created by rpashniev on 27.05.2015.
 */
public class AddNewActivity extends AbstractActivity {

    @Inject
    AddNewView addNewView;

    @Inject
    SearchView searchView;

    @Override
    public void start(AcceptsOneWidget acceptsOneWidget, com.google.gwt.event.shared.EventBus eventBus) {
        GWT.log("Apply view:"+addNewView);
        acceptsOneWidget.setWidget(addNewView);
    }
}
