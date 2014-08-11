package webservice;

import models.People;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by halil on 11.08.2014.
 */
@Path("/example2/")
public class Examples2 {


    @GET
    @Produces("text/plain")
    public String parthRootService() {
        return "Root Path";
    }


    @GET
    @Produces("text/plain")
    @Path("/getUser/{userName}")
    public String getExampleMetot(@PathParam("userName") String userName) {
        return userName;
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public String postParamerter(@FormParam("name") String name, @FormParam("surname") String surname) {
        return " Hoşgeldin " + name + " " + surname;
    }

    @POST
    @Path("/userJson")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public People postParamerter2(
            @FormParam("id") int id,
            @FormParam("name") String name,
            @FormParam("surname") String surname,
            @FormParam("gender") String gender
    ) {
        People people = new People();
        List<String> hobies = new ArrayList<String>();
        people.setId(id);
        people.setName(name);
        people.setSurname(surname);
        people.setGender(gender);
        hobies.add("Fenerbahçe");
        hobies.add("Playstation");
        people.setHobies(hobies);
        return people;
    }


}
