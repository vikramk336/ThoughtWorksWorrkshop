package com.thoughtworks.workshop.usermanagment.database;

import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.workshop.usermanagment.model.User;

public class DatabaseClass {
private static Map<Long,User> users=new HashMap<>();

public static Map<Long, User> getUsers() {
	return users;
}



}
