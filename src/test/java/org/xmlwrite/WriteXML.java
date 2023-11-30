package org.xmlwrite;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteXML {
	public static void main(String[] args) throws JAXBException {
		xmlWrite1();
}
	public static void xmlWrite1() throws JAXBException {
		//create a JAXBContext
		JAXBContext jb = JAXBContext.newInstance(AllEmployee.class);
		//create the marshellar
		Marshaller mar = jb.createMarshaller();
		
		//mention the xml path
		File loc=new File("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\XML\\empdetails1.xml");
	  
		EmpName name=new EmpName();
	   name.setFirstName1("suganya");
	   name.setLastName1("Raju");
	 Phno p=new Phno();
	  p.setOfficials(9677747233l);
	  p.setPersonals(9500839952l);
	 Permanent pp=new Permanent();
	  pp.setStreet("JayaNagar");
	  pp.setCity("Madurai");
	  pp.setState("TamilNadu");
	 Address ad=new Address();
	  ad.setPermanent(pp);
	  
	EmployeeDetails e=new EmployeeDetails();
	   e.setEmpIdNo(100);
	   e.setEmpNames(name);
	   e.setPhnos(p);
	   e.setAddresss(ad);
	   
	   EmpName name2=new EmpName();
	   name2.setFirstName1("Raj");
	   name2.setLastName1("Kumar");
	   Phno p2=new Phno();
		  p2.setOfficials(9665468899l);
		  p2.setPersonals(7643356952l);
		 Permanent pp2=new Permanent();
		  pp2.setStreet("RamNagar");
		  pp2.setCity("Ramnad");
		  pp2.setState("TamilNadu");
		 Address ad2=new Address();
		  ad2.setPermanent(pp);

	   EmployeeDetails e2=new EmployeeDetails();
	   e2.setEmpIdNo(200);
	   e2.setEmpNames(name2);
	   e2.setPhnos(p2);
	   e2.setAddresss(ad2);
	   
	   List<EmployeeDetails>empdetails=new LinkedList<EmployeeDetails>();
	   empdetails.add(e);
	   empdetails.add(e2);
	   AllEmployee all= new AllEmployee();
	   all.setEmployeeDetails(empdetails);
	   
	 mar.marshal(all, loc);
	 System.out.println("------Done------");
	   }

}
