package org.droft.prototype.dictionary.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;
import org.fusesource.restygwt.client.Defaults;

/**
 * Created by rdroft on 5/23/15.
 */
public class Dictionary implements EntryPoint {
    private final DictionaryServiceAsync dictionaryService = GWT.create(DictionaryServiceAsync.class);
    protected void initializeDefaults(){
        Defaults.setServiceRoot("/");
    }
    public void onModuleLoad() {
       initializeDefaults();
        DictionaryGinInjector injector =GWT.create(DictionaryGinInjector.class);
        injector.getPlaceHistoryHandler().handleCurrentHistory();

    }


}
