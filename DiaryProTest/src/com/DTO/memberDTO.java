package com.DTO;

public class memberDTO {
	private String Id;
	private String Pw;
	private String Name;
	private int Phone;
	
	
	public memberDTO(String id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public memberDTO(String id, String pw, String name, int phone) {
		super();
		Id = id;
		Pw = pw;
		Name = name;
		Phone = phone;
	}
	
	public memberDTO(String id, String name, int phone) {
		super();
		Id = id;
		Name = name;
		Phone = phone;
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
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	
	
	
}
