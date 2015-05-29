package org.droft.prototype.dictionary.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * Created by rpashniev on 29.05.2015.
 */
public class SearchPlace extends Place {
    private String searchParameters;
    public SearchPlace(String searchParameters){
        this.searchParameters = searchParameters;
    }

    String getSearchParameters(){
        return searchParameters;
    }

    @Prefix("search")
    public static class Tokenizer implements PlaceTokenizer<SearchPlace>
    {

        @Override
        public String getToken(SearchPlace place)
        {

            return place.getSearchParameters();
        }

        @Override
        public SearchPlace getPlace(String token)
        {
            return new SearchPlace(token);
        }

    }
}
