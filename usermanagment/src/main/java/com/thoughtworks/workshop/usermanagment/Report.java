package com.thoughtworks.workshop.usermanagment;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;

@Path("/report")
public class Report {
	UserService userService=new UserService();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/{userid}")
		public User getUser(@PathParam("userid") Long userid){
			return userService.getUser(userid);
		}
	
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<User> getallUsers(){
			return userService.getAllUsers();
		
		}
	

}
