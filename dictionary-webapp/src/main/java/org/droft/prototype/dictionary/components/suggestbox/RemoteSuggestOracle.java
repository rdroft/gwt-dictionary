package org.droft.prototype.dictionary.components.suggestbox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;

/**
 * Created by rdroft on 5/30/15.
 */
public class RemoteSuggestOracle  extends MultiWordSuggestOracle {
    @Override
    public void requestSuggestions(final Request request, final Callback callback) {
        GWT.log(request.getQuery());
         super.requestSuggestions(request,callback);
    }


}
