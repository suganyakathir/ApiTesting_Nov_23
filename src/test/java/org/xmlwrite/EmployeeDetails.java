package org.xmlwrite;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlread.Address;
import org.xmlread.EmpName;
import org.xmlread.Phno;
@XmlRootElement
@XmlType(propOrder= {"empId","empName","phno","address"})
public class EmployeeDetails {
        private int empId;
		private  EmpName empName;
		private Phno phno;
		private Address address;
		public int getEmpId() {
			return empId;
		}
		public void setEmpName(EmpName empName) {
			this.empName = empName;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public EmpName getEmpName() {
			return empName;
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
