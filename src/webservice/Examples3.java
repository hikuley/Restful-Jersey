package webservice;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 * Created by halil on 11.08.2014.
 */
@Path("/example3")
@Produces("application/json")
public class Examples3 {


    @GET
    @Path("multiValueGet")
    public MultivaluedMap<String, String> getUrlInfo(@Context UriInfo ui) {
        /*
            Çoklu değer karşılamak için kullanılır
        */
        MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
        return queryParams;
    }

    @POST
    @Path("multiValuePost")
    @Consumes("application/x-www-form-urlencoded")
    public MultivaluedMap<String, String> getMultiPost(@Context UriInfo ui) {
        /*
            Çoklu değer post değeri karşılamak için kullanılır
         */
        MultivaluedMap<String, String> postValues = ui.getQueryParameters();
        return postValues;
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Path("multiPostForm")
    public MultivaluedMap<String, String> post(MultivaluedMap<String, String> formParams) {
        /*
            Çoklu değer post Etmek için kullanılır ve çok sağlam çalışıyor :) :) :) 2014
         */
        return formParams;
    }

    @GET
    @Path("/multiHeaderGet")
    public MultivaluedMap<String, String> getHeader(@Context HttpHeaders hh) {
        /*
        * Çoklu headerı karşılamak için kullanılır
        */
        MultivaluedMap<String, String> headerParams = hh.getRequestHeaders();
        return headerParams;
    }

}
