package exam1;

import java.io.Serializable;
import java.time.LocalDate;

public class Emp implements Serializable {
private int empno;
private String ename;
private String email;
private double sal;
private String city;
private LocalDate date;
private Dept dept;
public Emp(int empno, String ename, String email, double sal, String city, LocalDate date, Dept dept) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.email = email;
	this.sal = sal;
	this.city = city;
	this.date = date;
	this.dept = dept;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
public int getEmpno() {
	return empno;
}
public double getSal() {
	return sal;
}
@Override
public String toString() {
	return "Emp [empno=" + empno + ", ename=" + ename + ", email=" + email + ", sal=" + sal + ", city=" + city
			+ ", date=" + date + ", dept=" + dept + "]";
}

}
