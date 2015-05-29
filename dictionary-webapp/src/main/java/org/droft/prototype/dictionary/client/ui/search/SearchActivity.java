package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;
import org.droft.prototype.dictionary.model.DictionaryReducedEntry;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rpashniev on 29.05.2015.
 */
public class SearchActivity extends AbstractActivity implements SearchPresenter{

    @Inject
    SearchView view;

    @Inject
    DictionaryServiceAsync dictionaryServiceAsync;

    public void updateViewWithData(List<DictionaryReducedEntry> entries){
         List<String> stringList = new ArrayList<>(entries.size());
         for(DictionaryReducedEntry e:entries){
             stringList.add(e.getKey());
         }
        view.setSearchList(stringList);
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
          dictionaryServiceAsync.getEntries(new MethodCallback<List<DictionaryReducedEntry>>() {
              @Override
              public void onFailure(Method method, Throwable throwable) {

              }

              @Override
              public void onSuccess(Method method, List<DictionaryReducedEntry> dictionaryReducedEntries) {
                     updateViewWithData(dictionaryReducedEntries);
              }
          });
           view.setPresenter(this);
           panel.setWidget(view);
    }
}
