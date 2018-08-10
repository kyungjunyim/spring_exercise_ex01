package org.zerock.domain;

public class UserVO {
	private String userid;
	private String userpwd;
	private String username;
	private int userpoint;
	public UserVO() {
		super();
	}
	public UserVO(String userid, String userpwd, String username, int userpoint) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
		this.userpoint = userpoint;
	}
	public String getUserid() {
		return userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public String getUsername() {
		return username;
	}
	public int getUserpoint() {
		return userpoint;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserpoint(int userpoint) {
		this.userpoint = userpoint;
	}
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", userpoint="
				+ userpoint + "]";
	}
}
