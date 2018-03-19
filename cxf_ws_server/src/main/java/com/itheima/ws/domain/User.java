package com.itheima.ws.domain;

/**
 * ClassName:User <br/>
 * Function: <br/>
 * Date: 2018年3月18日 下午5:48:08 <br/>
 */
public class User {
	private int id;
	private String username;
	private String password;

	public User() {
	}

	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
