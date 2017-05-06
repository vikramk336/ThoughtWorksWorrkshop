package com.thoughtworks.workshop.usermanagment;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;
@Path("/delete")
public class Delete {
	UserService userService=new UserService();
	

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{userid}/{flagOutstandingTxn}")
	public User deleteUser(@PathParam("userid") Long userid,@PathParam("flagOutstandingTxn") Boolean flagOutstandingTxn){
		if (!flagOutstandingTxn)
			return userService.deleteUser(userid);
		return null;
	}
}
