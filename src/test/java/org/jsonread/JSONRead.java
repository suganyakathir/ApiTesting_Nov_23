package org.jsonread;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {
	public static void main(String[] args) throws IOException, ParseException {
		readJson1();
	}
	public static void readJson() throws IOException, ParseException {
		//create Json Parser
		JSONParser jp= new JSONParser();
		//mention file loc
		FileReader r=new FileReader("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\JSON\\Sample.json");
		Object obj = jp.parse(r);
		//JSON Object
		JSONObject j= (JSONObject)obj;
		Object ol = j.get("username");
		System.out.println(ol);
		String st = ol.toString();
		System.out.println(st);
		System.out.println("password...."+j.get("password").toString());
		System.out.println("Email....."+j.get("email").toString());
		}
	public static  void readJson1() throws IOException, ParseException {
		JSONParser jp=new JSONParser();
		FileReader r=new FileReader("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\JSON\\Employee.json");
		Object obj = jp.parse(r);
		
		//JSONObject
		JSONObject j =(JSONObject)obj;
		Object objEmp = j.get("employee");
		System.out.println(objEmp);
		
		//JSONArray
		JSONArray a1=(JSONArray)objEmp;
		Object e1 = a1.get(0);
		System.out.println(e1);
		
		//JSONObject
		JSONObject je=(JSONObject)e1;
		Object o1 = je.get("efirstName");
		System.out.println(o1);
		System.out.println(o1.toString());
		
		System.out.println(je.get("elastName").toString());
		
		for(Object ob:a1) {
			System.out.println(ob);
			JSONObject jbb=(JSONObject)ob;
			System.out.println(jbb.get("efirstName").toString());
			System.out.println(jbb.get("elastName").toString());
			System.out.println();
			}
		
		//manager
		Object objMan = j.get("manager");
		System.out.println(objMan);
		
		JSONArray man=(JSONArray)objMan;
		for(Object om : man) {
			System.out.println(om);
			JSONObject jbb=(JSONObject)om;
			System.out.println(jbb.get("mfirstName").toString());
			System.out.println(jbb.get("mlastName").toString());
			System.out.println();
		}
		
		
		
		
		
		

	}
	

}
