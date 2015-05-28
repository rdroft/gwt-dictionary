package org.droft.prototype.dictionary.client.common;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import org.droft.prototype.dictionary.client.ui.addnew.AddNewPlace;
import org.droft.prototype.dictionary.client.ui.search.SearchPlace;

/**
 * Created by rdroft on 5/24/15.
 */
@WithTokenizers({DefaultPlace.Tokenizer.class, SearchPlace.Tokenizer.class, AddNewPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
