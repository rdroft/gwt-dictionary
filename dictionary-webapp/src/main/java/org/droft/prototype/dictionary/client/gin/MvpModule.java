package org.droft.prototype.dictionary.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Singleton;
import org.droft.prototype.dictionary.client.Dictionary;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;
import org.droft.prototype.dictionary.client.places.AppPlaceHistoryMapper;

/**
 * Created by rdroft on 5/24/15.
 */
public class MvpModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
        bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(Singleton.class);
        bind(DictionaryServiceAsync.class);
    }
}
