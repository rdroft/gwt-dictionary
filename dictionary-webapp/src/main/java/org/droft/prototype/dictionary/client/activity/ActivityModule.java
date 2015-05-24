package org.droft.prototype.dictionary.client.activity;

import com.google.gwt.inject.client.AbstractGinModule;

/**
 * Created by rdroft on 5/24/15.
 */
public class ActivityModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(MainActivity.class);
        bind(SecondActivity.class);
    }
}
