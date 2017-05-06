package com.thoughtworks.workshop.usermanagment;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;
@Path("/create")
public class Create {

	UserService userService=new UserService();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(User user){
		return userService.addUser(user);
	}
}
