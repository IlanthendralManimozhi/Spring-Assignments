package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class represents a Student entity, which is stored in a database table.
 * It has properties for the student's ID, name, age, and city.
 */
@Entity
public class Student {
	@Id
   private int sid; // The student's ID
   private String sname; // The student's name
   private int sage; // The student's age
   private String scity; // The student's city

   // Getter and setter methods for the properties
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}
}
