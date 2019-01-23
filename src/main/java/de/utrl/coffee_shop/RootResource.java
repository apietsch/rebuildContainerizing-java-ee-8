package de.utrl.coffee_shop;

import javax.ws.rs.*;

@Path("/")
public class RootResource {

    @GET
    public String getIndex() {
        return "Coffee";
    }

}
