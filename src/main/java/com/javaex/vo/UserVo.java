package com.javaex.vo;

public class UserVo {
	
	//필드
	private int no;
	private String name;
	private String hp;
	private String company;
	
	//생성ㅅ자
	
	public UserVo() {
		super();
	}
	
	public UserVo(int no, String name, String hp, String company) {
		super();
		this.no = no;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	
	
	//메서드 gs
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	
	//메서드 일반

	@Override
	public String toString() {
		return "UserVo [no=" + no + ", name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
}
