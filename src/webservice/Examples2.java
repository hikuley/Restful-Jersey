package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by halil on 11.08.2014.
 */
@Path("/example2/")
public class Examples2 {


    @GET
    @Produces("text/html")
    public String parthRootService() {
        return "Root Path";
    }


    @GET
    @Produces
    @Path("/getUser/{userName}")
    public String getExampleMetot(@PathParam("userName") String userName) {
        return userName;
    }


}
