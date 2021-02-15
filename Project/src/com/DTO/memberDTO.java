package com.DTO;

public class memberDTO {
	private String Id;
	private String Pw;
	private String Name;
	private int PhonNumber;
	
	
	public memberDTO(String id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public memberDTO(String id, String pw, String name, int phonNumber) {
		super();
		Id = id;
		Pw = pw;
		Name = name;
		PhonNumber = phonNumber;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPw() {
		return Pw;
	}
	public void setPw(String pw) {
		Pw = pw;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhonNumber() {
		return PhonNumber;
	}
	public void setPhonNumber(int phonNumber) {
		PhonNumber = phonNumber;
	}
	
	
	
}
