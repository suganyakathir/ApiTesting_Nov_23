package org.xmlwrite;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
//@XmlType(name="",propOrder= {"empIdNo","empNames","phones","addresses"})
public class AllEmployee {
	private List<EmployeeDetails>employeeDetails;

	public List<EmployeeDetails> getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
}
