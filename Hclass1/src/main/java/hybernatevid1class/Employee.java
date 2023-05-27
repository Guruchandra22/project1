package hybernatevid1class;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
 private String eid;
 private String ename;
 private double esal;
 private int x;
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
 
}
