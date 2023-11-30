package org.xmlwrite;


import javax.xml.bind.annotation.XmlType;


//@XmlRootElement
//@XmlType(propOrder= {"empIdNo","empNames","phones","addresses"})
public class EmployeeDetails {
        private int empIdNo;
		private  EmpName empNames;
		private Phno phnos;
		private Address addresss;
		public int getEmpIdNo() {
			return empIdNo;
		}
		public void setEmpIdNo(int empIdNo) {
			this.empIdNo = empIdNo;
		}
		public EmpName getEmpNames() {
			return empNames;
		}
		public void setEmpNames(EmpName empNames) {
			this.empNames = empNames;
		}
		public Phno getPhnos() {
			return phnos;
		}
		public void setPhnos(Phno phnos) {
			this.phnos = phnos;
		}
		public Address getAddresss() {
			return addresss;
		}
		public void setAddresss(Address addresss) {
			this.addresss = addresss;
		}
		
		
		

}
