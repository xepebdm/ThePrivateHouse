package com.maven.privatehouse.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String name;	
	private String user;
	private String password;
	private String email;
	private int userPhotoID;
	private List<Integer> userFiles;
	
	public UserBean(String name, String user, String password, String email) {
		this.name = name;
		this.user = user;
		this.password = password;
		this.email = email;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUser() {
		return user;
	}

	public String getEmail() {
		return email;
	}

	public int getUserPhotoID() {
		return userPhotoID;
	}

	public void setUserPhotoID(int userPhotoID) {
		this.userPhotoID = userPhotoID;
	}

	public List<Integer> getUserFiles() {
		return userFiles;
	}

	public void setUserFiles(Integer userFiles) {
		this.userFiles.add(userFiles);
	}
	
	
	

}
