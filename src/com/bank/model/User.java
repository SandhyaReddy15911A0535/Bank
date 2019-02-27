package com.bank.model;

import java.io.Serializable;

public class User implements Serializable{
private String firstname;
private long adharnum;
private long accnum;
private String acctype;
private String pancardnum;
private long phonenum;
private String address;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public long getAdharnum() {
	return adharnum;
}
public void setAdharnum(long adharnum) {
	this.adharnum = adharnum;
}
public long getAccnum() {
	return accnum;
}
public void setAccnum(long accnum) {
	this.accnum = accnum;
}
public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
public String getPancardnum() {
	return pancardnum;
}
public void setPancardnum(String pancardnum) {
	this.pancardnum = pancardnum;
}
public long getPhonenum() {
	return phonenum;
}
public void setPhonenum(long phonenum) {
	this.phonenum = phonenum;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
