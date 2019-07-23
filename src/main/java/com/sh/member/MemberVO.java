package com.sh.member;

import com.sh.file.FileVO;

public class MemberVO {
	private String id;
	private String pw;
	private String pw2;
	private String name;
	private String email;
	private FileVO fileVO;
	
	
	public FileVO getFileVO() {
		return fileVO;
	}
	public void setFileVO(FileVO fileVO) {
		this.fileVO = fileVO;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw2() {
		return pw2;
	}
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
