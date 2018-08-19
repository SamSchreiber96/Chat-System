package server.RestServices.MessengerRestService;

import org.json.JSONObject;
import server.RestServices.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Path("messenger")
public class MessengerRestService extends RestService {
    @GET
    @Path("session")
    public Response listAllSessions() {
        JSONObject json = new JSONObject();
        json.put("Hello", "World");
        return okJSON(Response.Status.OK, json.toString());
    }
}
