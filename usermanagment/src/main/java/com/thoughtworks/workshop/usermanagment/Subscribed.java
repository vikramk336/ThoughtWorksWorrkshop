package com.thoughtworks.workshop.usermanagment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;

@Path("/subscribed")
public class Subscribed {
	UserService userService=new UserService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{userid}")
	public User getauthentication(@PathParam("userid") long userid){
		return userService.getUser(userid);
	
	}

}
