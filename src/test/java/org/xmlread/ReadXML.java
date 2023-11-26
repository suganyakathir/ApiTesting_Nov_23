package org.xmlread;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXML {
	public static void main(String[] args) throws JAXBException {
		xmlRead3();
}
	public static void xmlRead() throws JAXBException {
		//create a JAXBContext
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		//create the unmarshellar
		Unmarshaller un = jb.createUnmarshaller();
		//mention the xml path
		File loc=new File("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\XML\\example1.xml");
	   //print the values
		Object obj = un.unmarshal(loc);
		Employee e=(Employee)obj;
		String name = e.getName(); 
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+e.getId());
		System.out.println("Employee email is "+e.getEmail());
		System.out.println("Employee phno is "+e.getPhno());
	}
	public static void xmlRead2() throws JAXBException {
		//create a JAXBContext
		JAXBContext jb = JAXBContext.newInstance(EmployeeDetails.class);
		//create the unmarshellar
		Unmarshaller un = jb.createUnmarshaller();
		//mention the xml path
		File loc=new File("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\XML\\empdetails.xml");
	   //print the values
		Object obj = un.unmarshal(loc);
		EmployeeDetails e=(EmployeeDetails)obj;
		System.out.println("Employee id is "+e.getEmpId());
		
		EmpName empName = e.getEmpName();
		System.out.println("Firstname...."+empName.getFirstName());
		System.out.println("Lastname...."+empName.getLastName());
		
		Phno phno = e.getPhno();
		System.out.println("Official...."+phno.getOfficial());
		System.out.println("Personal...."+phno.getPersonal());
		
		Address addr = e.getAddress();
		Permanent pr = addr.getPermanent();
		System.out.println("Street...."+pr.getStreet());
		System.out.println("City...."+pr.getCity());
		System.out.println("State...."+pr.getState());
		
	}
	public static void xmlRead3() throws JAXBException {
		//create a JAXBContext
		JAXBContext jb = JAXBContext.newInstance(AllEmployee.class);
		//create the unmarshellar
		Unmarshaller un = jb.createUnmarshaller();
		//mention the xml path
		File loc=new File("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\XML\\employeeList.xml");
	   //print the values
		Object obj = un.unmarshal(loc);
		AllEmployee e=(AllEmployee)obj;
		List<EmployeeDetails> empl = e.getEmployeeDetails();
		for(EmployeeDetails ed:empl) {
		System.out.println("Employee id is "+ed.getEmpId());
		
		EmpName empName = ed.getEmpName();
		System.out.println("Firstname...."+empName.getFirstName());
		System.out.println("Lastname...."+empName.getLastName());
		
		Phno phno = ed.getPhno();
		System.out.println("Official...."+phno.getOfficial());
		System.out.println("Personal...."+phno.getPersonal());
		
		Address addr = ed.getAddress();
		Permanent pr = addr.getPermanent();
		System.out.println("Street...."+pr.getStreet());
		System.out.println("City...."+pr.getCity());
		System.out.println("State...."+pr.getState());
		System.out.println();
		
	}
	
	}

}

