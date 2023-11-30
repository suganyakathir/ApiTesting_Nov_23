package org.jsonread;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reqres {
	public static void main(String[] args) throws IOException, ParseException {
		readJson();
	}
	public static void readJson() throws IOException, ParseException {
		JSONParser jp=new JSONParser();
		FileReader r= new FileReader("C:\\Users\\ACER\\eclipse-workspace\\ApiTesting_Nov_23\\src\\test\\resources\\JSON\\reqres.json");
		Object obj = jp.parse(r);
		
		//JSONObject
		JSONObject j=(JSONObject)obj;
		Object objdata = j.get("data");
		System.out.println(objdata);
		
		//JSONArray
		JSONArray ja=(JSONArray)objdata;
		Object a1 = ja.get(0);
		System.out.println(a1);
		
		//JSONObject
		JSONObject jo=(JSONObject)a1;
		Object fn = jo.get("first_name");
		System.out.println(fn);
		System.out.println(fn.toString());
		System.out.println(jo.get("last_name").toString());
		for(Object ob:ja) {
			System.out.println(ob);
			JSONObject jbb=(JSONObject)ob;
			System.out.println(jbb.get("first_name").toString());
			System.out.println(jbb.get("last_name").toString());
		}
		
		
		
	}

}
