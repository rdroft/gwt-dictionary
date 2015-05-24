package org.droft.prototype.dictionary.client;

import com.google.gwt.inject.client.AbstractGinModule;
import org.droft.prototype.dictionary.client.activity.ActivityModule;
import org.droft.prototype.dictionary.client.gin.MvpModule;
import org.droft.prototype.dictionary.client.ui.MainView;

/**
 * Created by rdroft on 5/24/15.
 */
public class DictionaryGinModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(MainView.class);
        install(new ActivityModule());
        install(new MvpModule());
    }
}
