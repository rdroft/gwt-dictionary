package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.user.client.ui.IsWidget;

import java.util.List;

/**
 * Created by rpashniev on 29.05.2015.
 */
public interface SearchView extends IsWidget {
    void setPresenter(SearchPresenter searchPresenter);

    void setSearchList(List<String> words);
}
