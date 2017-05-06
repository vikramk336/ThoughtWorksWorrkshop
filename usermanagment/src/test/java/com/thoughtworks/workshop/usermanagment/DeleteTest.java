package com.thoughtworks.workshop.usermanagment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.thoughtworks.workshop.usermanagment.model.User;
import com.thoughtworks.workshop.usermanagment.service.UserService;

public class DeleteTest {
	private UserService userService;
	private Delete delete;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		userService=new UserService();
		delete = new Delete();
	}

	@Test
	public void test() {
		User user=delete.deleteUser(1L, true);
	}

}
