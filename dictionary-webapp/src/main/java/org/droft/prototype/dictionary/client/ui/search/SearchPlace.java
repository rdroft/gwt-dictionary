package org.droft.prototype.dictionary.client.ui.search;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created by rdroft on 5/25/15.
 */
public class SearchPlace extends Place {
    private String token;
    public SearchPlace(String token){
       this.token = token;
    }
    public static class Tokenizer implements PlaceTokenizer<SearchPlace> {
        @Override
        public String getToken(SearchPlace place) {
            return "/search";
        }

        @Override
        public SearchPlace getPlace(String token) {
            return new SearchPlace(token);
        }
    }
}
