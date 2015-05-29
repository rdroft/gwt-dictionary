package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.SuggestBox;

import java.util.List;

/**
 * Created by rpashniev on 29.05.2015.
 */
public class SimpleSearchView extends Composite implements SearchView{
    SearchPresenter searchPresenter;
    MultiWordSuggestOracle suggestOracle;
    @Override
    public void setPresenter(SearchPresenter searchPresenter) {
        this.searchPresenter = searchPresenter;
    }

    @Override
    public void setSearchList(List<String> words) {
        suggestOracle.clear();
        suggestOracle.addAll(words);
    }

    interface SimpleSearchViewUiBinder extends UiBinder<Container, SimpleSearchView> {
    }

    private static SimpleSearchViewUiBinder ourUiBinder = GWT.create(SimpleSearchViewUiBinder.class);
    @UiField(provided = true)
    SuggestBox country;

    public SimpleSearchView() {
        suggestOracle = new MultiWordSuggestOracle();
        suggestOracle.clear();
        country = new SuggestBox(suggestOracle);
        initWidget(ourUiBinder.createAndBindUi(this));
    }


    protected void onLoad(){

    }
}