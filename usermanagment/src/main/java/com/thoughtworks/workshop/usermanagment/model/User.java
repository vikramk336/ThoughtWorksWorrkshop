package com.thoughtworks.workshop.usermanagment.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
private long userid;

private String firstname;
private String lastname;
private String role;
private boolean isSubscibed;

public User(){
	
}

public User(long userid,String firstname,String lastname,String role,boolean isSubscribed){
	this.userid=userid;
	this.firstname=firstname;
	this.lastname=lastname;
	this.role=role;
	this.isSubscibed=false;
}
public long getUserid() {
	return userid;
}
public void setUserid(long userid) {
	this.userid = userid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public boolean isSubscibed() {
	return isSubscibed;
}
public void setSubscibed(boolean isSubscibed) {
	this.isSubscibed = isSubscibed;
}

}
