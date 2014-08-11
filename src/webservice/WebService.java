package webservice;

import models.People;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import java.util.ArrayList;
import java.util.List;

@Path("/hello")
public class WebService {

    @GET
    @Produces("application/json")
    @Path("/helloJson")
    public List<User> getJsonHello() {
        User users = new User();
        users.setName("gklp");
        users.setSurname("ksc");

        User users1 = new User();
        users1.setName("gklp");
        users1.setSurname("ksc");

        User users2 = new User();
        users2.setName("gklp");
        users2.setSurname("ksc");

        ArrayList<String> hobbies = new ArrayList<String>();
        hobbies.add("basketball");
        hobbies.add("football");
        users.setHobbies(hobbies);


        List<User> userList = new ArrayList<User>();
        userList.add(users);
        userList.add(users1);
        userList.add(users2);

        return userList;
    }

    @GET
    @Produces("application/json;charset=utf-8")
    @Path("/getPeoples")
    public List<People> getPeopleList() {
        List<People> peopleList = new ArrayList<People>();
        for (int i = 0; i < 20; i++) {
            List<String> hobies = new ArrayList<String>();
            hobies.add("deneme");
            hobies.add("deneme");
            hobies.add("deneme");

            People people = new People();
            people.setName("Halil İbrahim");
            people.setSurname("Küley");
            people.setGender("Erkek");
            people.setHobies(hobies);

            peopleList.add(people);
        }
        return peopleList;
    }


    @GET
    @Path("/sessionCreat")
    @Produces("application/json;charset=utf-8")
    public String sessionCreate(@Context HttpServletRequest request) {
        /*
             Sesion tanımlamak için kullanılan metot
         */
        HttpSession session = request.getSession();
        if (session.isNew()) {
            return "Sesion değişkeni tanımladı";

        } else {
            return "Sesion değişkeni zaten mevcut";
        }

    }


}