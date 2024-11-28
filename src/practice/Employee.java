package practice;

import java.sql.Date;

public class Employee {
	
	private int eid;
	private String ename;
	private double sal;
	private Date hiredate;
	private int mgr;
	private byte deptno;
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getId() {
		return eid;
	}
	
	
	public void setName(String ename) {
		this.ename=ename;
	}
	public String getName() {
		return ename;
	}
	
	
	public void setSal(double sal) {
		this.sal=sal;
	}
	public double getSal(){
		return sal;
	}
	
	
	public void setHireDate(Date d) {
		this.hiredate=d;
	}
	public Date getHireDate() {
		return hiredate;
	}
	
	
	public void setMgr(int mgr){
		this.mgr=mgr;
	}
	public int getMgr() {
		return mgr;
	}
	
	
	public void setDeptno(byte deptno) {
		this.deptno=deptno;
	}
	public int getDeptno() {
		return deptno;
	}
}
