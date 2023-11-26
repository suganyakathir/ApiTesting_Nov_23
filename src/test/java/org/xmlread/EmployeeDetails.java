package org.xmlread;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class EmployeeDetails {
	private int empId;
	private  EmpName empName;
	private Phno phno;
	private Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public EmpName getEmpName() {
		return empName;
	}
	public void setEmpName(EmpName empName) {
		this.empName = empName;
	}
	public Phno getPhno() {
		return phno;
	}
	public void setPhno(Phno phno) {
		this.phno = phno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
