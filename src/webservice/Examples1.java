package webservice;

import javax.ws.rs.*;

/**
 * Created by halil on 11.08.2014.
 */

@Path("/example1")
public class Examples1 {


    @GET
    @Produces("text/html")
    public String getMetodu() {
        return "Get Metodu";
    }

    @POST
    @Produces("text/html")
    public String postMetodu() {
        return "Post Metodu";
    }

    @PUT
    @Produces("text/html")
    public String putMetodu() {
        return "Put Metodu";
    }

    @DELETE
    @Produces("text/html")
    public String deleteMetodu() {
        return "Delete Metodu";
    }


    @HEAD
    @Produces("text/html")
    public void headMetot() {
        System.out.println("Head Metodu Çalıştı");
    }

}
