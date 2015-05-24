package org.droft.prototype.dictionary.client.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.droft.prototype.dictionary.client.places.MainPlace;
import org.droft.prototype.dictionary.client.places.SecondPlace;

/**
 * Created by rdroft on 5/24/15.
 */
public class MainActivityMapper implements ActivityMapper{
    Provider<MainActivity> mainActivityProvider;
    Provider<SecondActivity> secondActivityProvider;
    @Inject
    MainActivityMapper(Provider<MainActivity> mainActivityProvider,Provider<SecondActivity> secondActivityProvider){
        this.mainActivityProvider = mainActivityProvider;
        this.secondActivityProvider = secondActivityProvider;
    }
    @Override
    public Activity getActivity(Place place) {
        if(place instanceof MainPlace){
           return this.mainActivityProvider.get();
        }else if(place instanceof SecondPlace){
            return  this.secondActivityProvider.get();
        }
        return null;
    }
}
