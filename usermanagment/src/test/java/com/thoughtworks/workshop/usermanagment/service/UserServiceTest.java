package com.thoughtworks.workshop.usermanagment.service;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.thoughtworks.workshop.usermanagment.database.DatabaseClass;
import com.thoughtworks.workshop.usermanagment.model.User;

public class UserServiceTest {

	
	@Test
	public void test() {
		UserService userService=new UserService();
		User user = new User();
		user.setFirstname("vikram");
		user.setUserid(1L);
		Map<Long, User> users=DatabaseClass.getUsers();
		userService.addUser(user);

		Assert.assertEquals(users,DatabaseClass.getUsers());
	}

}
