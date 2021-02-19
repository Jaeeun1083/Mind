package com.DTO;

public class writeDTO {
	private String feel;
	private String star;
	private String text;
	
	private String filename;
	private String filerealname;
	
	
	
	public writeDTO(String filename, String filerealname) {
		super();
		this.filename = filename;
		this.filerealname = filerealname;
	}
	
	
	
	
	
	
	public String getFeel() {
		return feel;
	}
	public void setFeel(String feel) {
		this.feel = feel;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilerealname() {
		return filerealname;
	}
	public void setFilerealname(String filerealname) {
		this.filerealname = filerealname;
	}
	
	
}
