package org.jsonread;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {
	public static void main(String[] args) throws IOException, ParseException {
		readJson();
	}
	private static void readJson() throws IOException, ParseException {
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

}
