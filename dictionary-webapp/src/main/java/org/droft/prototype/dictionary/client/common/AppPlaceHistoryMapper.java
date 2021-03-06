package org.droft.prototype.dictionary.client.common;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import org.droft.prototype.dictionary.client.places.DefaultPlace;
import org.droft.prototype.dictionary.client.places.SearchPlace;
import org.droft.prototype.dictionary.client.ui.addnew.AddNewPlace;


/**
 * Created by rdroft on 5/24/15.
 */
@WithTokenizers({DefaultPlace.Tokenizer.class, SearchPlace.Tokenizer.class, AddNewPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
