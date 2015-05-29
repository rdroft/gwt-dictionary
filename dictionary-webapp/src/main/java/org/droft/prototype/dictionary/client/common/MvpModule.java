package org.droft.prototype.dictionary.client.common;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;
import org.droft.prototype.dictionary.client.places.DefaultPlace;
import org.droft.prototype.dictionary.client.ui.addnew.AddNewView;
import org.droft.prototype.dictionary.client.ui.addnew.DefaultAddNewView;
import org.droft.prototype.dictionary.client.ui.search.SearchView;
import org.droft.prototype.dictionary.client.ui.search.SimpleSearchView;

/**
 * Created by rdroft on 5/24/15.
 */
public class MvpModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
        bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(Singleton.class);
        bind(DictionaryServiceAsync.class).in(Singleton.class);
        bind(ActivityMapper.class).to(MainActivityMapper.class).in(Singleton.class);
        bind(AddNewView.class).to(DefaultAddNewView.class).in(Singleton.class);
        bind(SearchView.class).to(SimpleSearchView.class).in(Singleton.class);
    }


    /**
     * Creates a new PlaceHistoryHandler.  This object is responsible handling navigation based on the browser URL.
     * You only need one of those for the entire app.
     *
     * @param placeController the place controller.
     * @param historyMapper This is used to map the URL to a Place object and vice versa.
     * @param eventBus the event bus.
     * @return
     */
    @Provides
    @Singleton
    public PlaceHistoryHandler getHistoryHandler(PlaceController placeController,
                                                 PlaceHistoryMapper historyMapper,
                                                 EventBus eventBus) {
        PlaceHistoryHandler historyHandler =  new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eventBus, new DefaultPlace());
        return historyHandler;
    }

    /**
     * Creates a new PlaceController. The place controller is used by the PlaceHistoryHandler and activities
     * to tell the app to navigate to a different place. You only need one for the
     * entire app. However, it is essential for it to get instantiated in order
     * for the application navigation to work.
     *
     * @param eventBus the event bus.
     * @return
     */
    @Provides
    @Singleton
    public PlaceController getPlaceController(EventBus eventBus) {
        return new PlaceController(eventBus);
    }



    @Provides
    @Singleton
    public ActivityManager getActivityManager(ActivityMapper activityMapper,EventBus eventBus){
        return new ActivityManager(activityMapper, eventBus);
    }

}
