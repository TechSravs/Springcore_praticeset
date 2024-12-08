package com.techpalle.bean;

public class Student {

	private int sno;
	private String sname;
	private String course;
	
	public Student(){	
	}

	public Student(int sno, String sname, String course) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
