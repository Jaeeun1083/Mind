package com;

public class MemberDTO {
	
	private String id;
	private String nick;
	private String pw;
		
	public MemberDTO(String id, String pw) {		
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public MemberDTO(String id, String nick, String pw) {		
		this.id = id;
		this.nick = nick;
		this.pw = pw;
	}		
}


	
	

