package org.droft.prototype.dictionary.client.ui.addnew;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * Created by rpashniev on 27.05.2015.
 */
public class AddNewPlace extends Place {
    String tooken;
    public AddNewPlace(String tooken) {
        this.tooken = tooken;
    }

    @Prefix("addnew")
    public static class Tokenizer implements PlaceTokenizer<AddNewPlace> {
        @Override
        public String getToken(AddNewPlace place) {
            GWT.log("getToken executed");
            return  "";
        }

        @Override
        public AddNewPlace getPlace(String token) {
            return new AddNewPlace(token);
        }
    }
}
