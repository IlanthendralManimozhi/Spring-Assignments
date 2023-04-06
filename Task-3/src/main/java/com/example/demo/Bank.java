package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class Bank {
@Id
private int uid;
private String uname;
private int uamount;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public int getUamount() {
	return uamount;
}
public void setUamount(int uamount) {
	this.uamount = uamount;
}


}
