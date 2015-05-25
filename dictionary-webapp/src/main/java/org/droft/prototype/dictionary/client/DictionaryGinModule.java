package org.droft.prototype.dictionary.client;

import com.google.gwt.inject.client.AbstractGinModule;
import org.droft.prototype.dictionary.client.common.MvpModule;

/**
 * Created by rdroft on 5/24/15.
 */
public class DictionaryGinModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new MvpModule());
    }
}
