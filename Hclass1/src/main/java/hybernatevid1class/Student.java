package hybernatevid1class;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Studentclass1")
public class Student {
	@Id
	private int sid;
	private String sname;
	private double smarks;
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
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	
		
	
}
