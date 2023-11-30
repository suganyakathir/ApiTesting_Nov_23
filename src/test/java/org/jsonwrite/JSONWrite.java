package org.jsonwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;

public class JSONWrite {
	public static void main(String[] args) throws IOException {
		writeJSON();
	}
	public static void writeJSON() throws IOException {
		JSONObject jo=new JSONObject();
		 jo.put("id", 7);
		 jo.put("email","michael.lawson@reqres.in");
		 jo.put( "first_name", "Michael");
		 jo.put( "last_name","Lawson" );
		 jo.put("avatar", "https://reqres.in/img/faces/7-image.jpg");
		 System.out.println(jo);
		 Map<String,String>mp1=new LinkedHashMap<>();
		 mp1.put("id","7");
		 mp1.put("email","michael.lawson@reqres.in");
		 mp1.put("first_name","Michael");
		 mp1.put("last_name", "Lawson");
		 mp1.put("avatar", "https://reqres.in/img/faces/7-image.jpg");
		 
		 JSONArray je=new JSONArray();
		 je.add(mp1);
		 System.out.println(mp1);
		 System.out.println(je);
		 
		 JSONObject jo1=new JSONObject();
		 jo1.put("data",je);
		 System.out.println(jo1);
		 
	//	 Write to file
		 FileWriter loc= new FileWriter("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\JSON\\reqWrite.json");
		 loc.write(jo1.toJSONString());
		 loc.flush();
		 System.out.println("-------Done------");
		 
		 //GSON
		 Map m= new LinkedHashMap<>();
		 m.put("data", je);
		 Gson g= new Gson();
		 String ob = g.toJson(m);
		 System.out.println(ob);
		 FileWriter loc2=new FileWriter("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\JSON\\reqWrite1.json");
		 loc2.write(ob);
		 loc2.flush();
		 System.out.println("-------Done-------");
		 

	}
	

}
