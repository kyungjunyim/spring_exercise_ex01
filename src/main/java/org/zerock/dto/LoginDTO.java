package org.zerock.dto;

public class LoginDTO {
	private String userid;
	private String userpwd;
	private boolean useCookie;
	public LoginDTO() {
		super();
	}
	public LoginDTO(String userid, String userpwd, boolean useCookie) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.useCookie = useCookie;
	}
	public String getUserid() {
		return userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public boolean isUseCookie() {
		return useCookie;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + ", userpwd=" + userpwd + ", useCookie=" + useCookie + "]";
	}
}
