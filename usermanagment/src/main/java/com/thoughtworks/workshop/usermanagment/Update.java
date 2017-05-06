package com.thoughtworks.workshop.usermanagment;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;
@Path("/update")
public class Update {

UserService userService=new UserService();
	
	@PUT
	@Path("/{userid}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User updateUser(User user,@PathParam("userid") Long userid){
		user.setUserid(userid);
		return userService.updateUser(user);
	}
	
}
