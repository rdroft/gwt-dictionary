package org.droft.prototype.dictionary.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import org.droft.prototype.dictionary.client.ui.main.MainView;

@GinModules({DictionaryGinModule.class})
public interface DictionaryGinInjector extends Ginjector {

   MainView getMainAppView();
   ActivityManager getActivityManager();
   PlaceHistoryHandler getPlaceHistoryHandler();
}
