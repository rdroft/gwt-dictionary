package org.droft.prototype.dictionary.client.common;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import org.droft.prototype.dictionary.client.places.DefaultPlace;
import org.droft.prototype.dictionary.client.places.SearchPlace;
import org.droft.prototype.dictionary.client.ui.addnew.AddNewActivity;
import org.droft.prototype.dictionary.client.ui.addnew.AddNewPlace;
import org.droft.prototype.dictionary.client.ui.search.SearchActivity;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by rdroft on 5/24/15.
 */
public class MainActivityMapper implements ActivityMapper{
    Provider<SearchActivity> searchActivityProvider;
    Provider<AddNewActivity> addNewActivityProvider;

    @Inject
    MainActivityMapper(Provider<SearchActivity> searchActivityProvider,Provider<AddNewActivity> addNewActivityProvider){
        this.searchActivityProvider = searchActivityProvider;
        this.addNewActivityProvider = addNewActivityProvider;
    }

    @Override
    public Activity getActivity(Place place) {
        GWT.log("getActivity for "+place.getClass());
        if(place instanceof DefaultPlace){
            return searchActivityProvider.get();
        }if(place instanceof SearchPlace){
            return searchActivityProvider.get();
        }if (place instanceof AddNewPlace){
            return  addNewActivityProvider.get();
        }
        return null;
    }
}
