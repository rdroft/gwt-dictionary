package org.droft.prototype.dictionary.client;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import org.droft.prototype.dictionary.client.ui.MainView;

@GinModules({DictionaryGinModule.class})
public interface DictionaryGinInjector extends Ginjector {
 //  PlaceHistoryHandler getPlaceHistoryHandler();
   MainView getAppWidget();
}
