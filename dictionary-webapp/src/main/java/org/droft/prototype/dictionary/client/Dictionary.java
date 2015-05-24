package org.droft.prototype.dictionary.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import org.droft.prototype.dictionary.client.model.DictionaryServiceAsync;
import org.droft.prototype.dictionary.model.DictionaryReducedEntry;
import org.fusesource.restygwt.client.*;

import java.util.List;

/**
 * Created by rdroft on 5/23/15.
 */
public class Dictionary implements EntryPoint {
    private final DictionaryServiceAsync dictionaryService = GWT.create(DictionaryServiceAsync.class);
    protected void initializeDefaults(){
        Defaults.setServiceRoot("/");
    }
    DictionaryGinInjector injector =GWT.create(DictionaryGinInjector.class);
    public void onModuleLoad() {
       initializeDefaults();
        RootPanel.get().add(injector.getAppWidget());
    }


}
