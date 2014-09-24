package org.dd.sso.bean;

public class User {

	private String userName;
	private String password;
	private String enabled;
	private String userNameCN;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getUserNameCN() {
		return userNameCN;
	}
	public void setUserNameCN(String userNameCN) {
		this.userNameCN = userNameCN;
	}
	
	
}
