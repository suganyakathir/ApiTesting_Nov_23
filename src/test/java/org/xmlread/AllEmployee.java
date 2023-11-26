package org.xmlread;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AllEmployee {
private List<EmployeeDetails>employeeDetails;

public List<EmployeeDetails> getEmployeeDetails() {
	return employeeDetails;
}

public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
	this.employeeDetails = employeeDetails;
}
}
