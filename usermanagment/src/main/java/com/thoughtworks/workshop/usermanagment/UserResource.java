package com.thoughtworks.workshop.usermanagment;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;
@Path("/user")
public class UserResource {

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
	
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public User getUser(User user){
			return userService.addUser(user);
		}
		
		@DELETE
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("/{userid}/{flagOutstandingTxn}")
		public User deleteUser(@PathParam("userid") Long userid,@PathParam("flagOutstandingTxn") Boolean flagOutstandingTxn){
			if (!flagOutstandingTxn)
				return userService.deleteUser(userid);
			return null;
		}

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("subscribed/{userid}")
		public User getauthentication(@PathParam("userid") long userid){
			return userService.getUser(userid);
		
		}
		
		
		@PUT
		@Path("/{userid}")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public User updateUser(User user,@PathParam("userid") Long userid){
			user.setUserid(userid);
			return userService.updateUser(user);
		}
		
}
