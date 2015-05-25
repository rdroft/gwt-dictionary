package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Created by rdroft on 5/25/15.
 */
public class DefaultSearchView extends Composite implements SearchView{
    interface DefaultSearchViewUiBinder extends UiBinder<HTMLPanel, DefaultSearchView> {
    }

    @UiField
    TextBox textBox;
    private static DefaultSearchViewUiBinder ourUiBinder = GWT.create(DefaultSearchViewUiBinder.class);

    public DefaultSearchView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}