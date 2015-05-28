package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;
import org.droft.prototype.dictionary.model.DictionaryReducedEntry;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

/**
 * Created by rdroft on 5/25/15.
 */
public class SearchActivity extends AbstractActivity {
    @Inject
    SearchView searchView;

    @Inject
    DictionaryServiceAsync dictionaryService;

    @Override
    public void start(AcceptsOneWidget panel, com.google.gwt.event.shared.EventBus eventBus) {
         dictionaryService.getEntries(new DictionaryCallbacks());
         panel.setWidget(searchView);
    }

    class DictionaryCallbacks  implements MethodCallback<List<DictionaryReducedEntry>>{

        @Override
        public void onFailure(Method method, Throwable throwable) {

        }

        @Override
        public void onSuccess(Method method, List<DictionaryReducedEntry> dictionaryReducedEntries) {

        }
    }
}
