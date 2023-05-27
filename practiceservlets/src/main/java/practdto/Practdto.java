package practdto;

import java.security.PrivateKey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Practdto {
	
	
	
	
 @Override
	public String toString() {
		return "Practdto [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", number=" + number + "]";
	}
@Id
 private int sid;
 private String sname;
 private String gender;
 private long number;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
 
}
