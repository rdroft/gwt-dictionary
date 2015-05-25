package org.droft.prototype.dictionary.client.common;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created by rpashniev on 25.05.2015.
 */
public class DefaultPlace extends Place {
    public static class Tokenizer implements PlaceTokenizer<DefaultPlace> {
        @Override
        public String getToken(DefaultPlace place) {
            return "/";
        }

        @Override
        public DefaultPlace getPlace(String token) {
            return new DefaultPlace();
        }
    }
}
