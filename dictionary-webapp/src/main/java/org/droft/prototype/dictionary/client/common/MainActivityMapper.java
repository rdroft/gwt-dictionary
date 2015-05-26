package org.droft.prototype.dictionary.client.common;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import org.droft.prototype.dictionary.client.ui.search.SearchActivity;
import org.droft.prototype.dictionary.client.ui.search.SearchPlace;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by rdroft on 5/24/15.
 */
public class MainActivityMapper implements ActivityMapper{
    Provider<SearchActivity> searchActivityProvider;
    @Inject
    MainActivityMapper(Provider<SearchActivity> searchActivityProvider){
        this.searchActivityProvider = searchActivityProvider;
    }

    @Override
    public Activity getActivity(Place place) {
        if(place instanceof DefaultPlace){
            return searchActivityProvider.get();
        }if(place instanceof SearchPlace){
            return searchActivityProvider.get();
        }
        return null;
    }
}
