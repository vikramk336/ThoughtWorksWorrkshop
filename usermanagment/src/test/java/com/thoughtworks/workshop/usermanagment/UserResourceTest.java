package com.thoughtworks.workshop.usermanagment;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.workshop.usermanagment.database.DatabaseClass;
import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;

public class UserResourceTest {
	private UserResource userResource;
	UserService userService;

	@Before
	public void setUp() throws Exception {
		userResource=new UserResource();
		userService=new UserService();
	}

	@Test
	public void testGetUserLong() {
		User user =new User();
		user.setUserid(1L);
		user.setFirstname("vik");
		user.setLastname("kul");
		user.setRole("admin");
		user.setSubscibed(false);
		User user2= userService.getUser(1L);
		Assert.assertEquals(user, user2);

	}

	@Test
	public void testGetallUsers() {
		List<User> user2= userService.getAllUsers();
		Assert.assertEquals(new ArrayList<User>(DatabaseClass.getUsers().values()), user2);

	}

	@Test
	public void testAddUser() {
		User user =new User();
		user.setUserid(3L);
		user.setFirstname("hhh");
		user.setLastname("fff");
		user.setRole("admin");
		user.setSubscibed(false);
		User user2= userResource.getUser(user);

		Assert.assertEquals(DatabaseClass.getUsers(), userResource.getallUsers());
	}

	@Test
	public void testDeleteUser() {
		User user =new User();	
		User user2 =new User();
		user=userService.deleteUser(1L);
		List<User> users=userService.getAllUsers();
        user2=userResource.deleteUser(1L, false);
		Assert.assertEquals(user,user2);

	}

	@Test
	public void testGetauthentication() {
	}

	@Test
	public void testUpdateUser() {
	}

}
