package xampropack;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class ReadDatafromjsonfile {
	

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser=new JSONParser() ;
		
		FileReader reader=new FileReader(".\\jsonfiles\\registration.json");
		
		Object obj=jsonparser.parse(reader);
		
		JSONObject regjsonobj=(JSONObject)obj;
		
		String name = (String) regjsonobj.get("Enter Full Name");
		String email = (String) regjsonobj.get("Enter Email");
		String phone = (String) regjsonobj.get("Enter Phone");
		String password = (String) regjsonobj.get("Enter Password");
		String cpassword = (String) regjsonobj.get("Enter Confirm Password");
		
		System.out.println("Enter Full Name "+name);
		System.out.println("Enter Email "+email);
		System.out.println("Enter Phone "+phone);
		System.out.println("Enter Password "+password);
		System.out.println("Enter Confirm Password"+cpassword);
		
      
	
	}
	}
	
	
	
	