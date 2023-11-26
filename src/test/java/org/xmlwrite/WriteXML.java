package org.xmlwrite;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.xmlread.AllEmployee;
public class WriteXML {
	public static void main(String[] args) throws JAXBException {
		xmlWrite1();
}
	public static void xmlWrite1() throws JAXBException {
		//create a JAXBContext
		JAXBContext jb = JAXBContext.newInstance(EmployeeDetails.class);
		//create the marshellar
		Marshaller mar = jb.createMarshaller();
		
		//mention the xml path
		File loc=new File("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\XML\\empdetails1.xml");
	  
		EmpName name=new EmpName();
	   name.setFirstName1("suganya");
	   name.setLastName1("Raju");
	 Phno p=new Phno();
	  p.setOfficial(9677747233l);
	  p.setPersonal(9500839952l);
	 Permanent pp=new Permanent();
	  pp.setStreet("AdamNagar");
	  pp.setCity("Madurai");
	  pp.setState("TamilNadu");
	 Address ad=new Address();
	  ad.setPermanent(pp);
	  
	 EmployeeDetails e=new EmployeeDetails();
	   e.setEmpId(100);
	   e.setEmpName(name);
	   e.setPhno(pp);
	   e.setAddress(ad);
	 mar.marshal(e, loc);
	 System.out.println("------Done------");
	   }

}
