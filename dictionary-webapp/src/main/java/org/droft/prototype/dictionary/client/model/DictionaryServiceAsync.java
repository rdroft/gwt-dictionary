package org.droft.prototype.dictionary.client.model;
import  org.droft.prototype.dictionary.model.DictionaryReducedEntry;
import org.droft.prototype.dictionary.model.User;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/api/dictionary")
@Produces("application/json")
public interface DictionaryServiceAsync extends RestService {
    @GET
    @Path("/")
    void getEntries(MethodCallback<List<DictionaryReducedEntry>> methodCallback);

    @GET
    @Path("/user")
    void getUser(MethodCallback<User> methodCallback);
}
