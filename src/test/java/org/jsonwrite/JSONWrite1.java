package org.jsonwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;

public class JSONWrite1 {
	public static void main(String[] args) throws IOException {
		writeJSON2();
	}
	public static void writeJSON() {
		JSONObject jo=new JSONObject();
		jo.put("name", "manoj");
		jo.put("email", "mk@gmail.com");
		jo.put("phno", "9677747233l");
		jo.put("browser", "chrome");
	System.out.println(jo);
	
	JSONArray ja=new JSONArray();
	 ja.add("chrome");
	 ja.add("firefox");
	 ja.add("edge");
	 ja.add("opera");
   System.out.println(ja);	 
   jo.put("browser", ja);
   System.out.println(jo);
	
	}
	public static void writeJSON2() throws IOException  {
		//employee
	Map<String,String>mp1=new LinkedHashMap<>();
	mp1.put("efirstName", "Jhon");
	mp1.put("elastName", "Peter");
	Map<String,String>mp2=new LinkedHashMap<>();
	mp2.put("efirstName", "Manoj");
	mp2.put("elastName", "Sekar");
	Map<String,String>mp3=new LinkedHashMap<>();
	mp3.put("efirstName", "Ram");
	mp3.put("elastName", "Kumar");
	
	JSONArray ja=new JSONArray();
	ja.add(mp1);
	ja.add(mp2);
	ja.add(mp3);
	
	System.out.println(mp1);
	System.out.println(mp2);
	System.out.println(mp3);
	System.out.println(ja);
	
	JSONObject jo=new JSONObject();
	jo.put("employee", ja);
	System.out.println(jo);
	
	//manager
	Map<String,String> mp1n=new LinkedHashMap<>();
	mp1n.put("mfirstName", "Anna");
	mp1n.put("mlastName", "smith");
	Map<String,String> mp2n=new LinkedHashMap<>();
	mp2n.put("mfirstName", "Peter");
	mp2n.put("mlastName", "Jones");
	Map<String,String> mp3n=new LinkedHashMap<>();
	mp3n.put("mfirstName", "Jhon");
	mp3n.put("mlastName", "Doe");
	
	JSONArray ja1=new JSONArray();
	ja1.add(mp1n);
	ja1.add(mp2n);
	ja1.add(mp3n);
	
	System.out.println(mp1n);
	System.out.println(mp2n);
	System.out.println(mp3n);
	System.out.println(ja1);
	
	JSONObject jo1=new JSONObject();
	jo1.put("Manager", ja1);
	System.out.println(jo1);
	
	//Write to File
	FileWriter loc=new FileWriter("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\JSON\\NewEmployee.json");
	loc.write(jo1.toJSONString());
	loc.flush();
	System.out.println("------Done-------");
	
	//GSON
	Map m= new LinkedHashMap<>();
	m.put("Employee", ja);
	m.put("Manager", ja1);
	
	Gson g= new Gson();
	String gn = g.toJson(m);
	System.out.println(gn);
	
	//Write to File
	FileWriter loc2= new FileWriter("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\JSON\\NewEmployee2.json");
	loc2.write(gn);
	loc2.flush();
	System.out.println("------Done-------");
	
	
	
		
	}
	
   
	 
	
	
		
		
		
		
	}


