package org.droft.prototype.dictionary.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * Created by rdroft on 5/24/15.
 */
public class SecondView {
    interface SecondViewUiBinder extends UiBinder<DivElement, SecondView> {
    }

    private static SecondViewUiBinder ourUiBinder = GWT.create(SecondViewUiBinder.class);

    public SecondView() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}