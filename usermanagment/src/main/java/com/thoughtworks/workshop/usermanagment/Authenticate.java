package com.thoughtworks.workshop.usermanagment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/authenticate")

public class Authenticate {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{userid}")
	public String getauthentication(@PathParam("userid") String userid){
		return "valid";
	
	}
}

