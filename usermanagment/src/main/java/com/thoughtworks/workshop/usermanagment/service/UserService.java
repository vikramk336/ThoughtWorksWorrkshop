package com.thoughtworks.workshop.usermanagment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.thoughtworks.workshop.usermanagment.database.DatabaseClass;
import com.thoughtworks.workshop.usermanagment.model.User;

public class UserService {

	private Map<Long, User> users=DatabaseClass.getUsers();

	public UserService(){
		users.put(1L,new User(1, "vik", "kul", "admin", false));
		users.put(2L,new User(2, "ttt", "ddd", "user", false));
	}
	
	public List getAllUsers(){
		return  new ArrayList<User>(users.values());
	}

	public User getUser(long id){
		return users.get(id);
	}

	public User addUser(User user){
		user.setUserid(users.size()+1);
		users.put(user.getUserid(), user);
		return user;
	}
	
	public User updateUser(User user){
		if (user.getUserid()<0)
			return null;
		users.put(user.getUserid(), user);
		return user;
	}
	
	public User deleteUser(long id){
		return users.remove(id);
	}
}
