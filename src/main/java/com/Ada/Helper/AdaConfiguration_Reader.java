package com.Ada.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AdaConfiguration_Reader {
	
	public static Properties p;
	
	public AdaConfiguration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\src\\main\\java\\com\\properties\\AdaConfiguration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
	}
	
	public String getCardNumber() {
		
		String cardnumber = p.getProperty("cardnumber");
		
		return cardnumber;

	}
	
	public String getCVV() {
		
		String cvv = p.getProperty("cvv");
		
		return cvv;
	}
	
	public String getUrl() {

		String url = p.getProperty("url");
		
		return url;
	}
	
	public String getCheckInDate() {

		String checkindate = p.getProperty("checkindate");
		
		return checkindate;
		
	}
	
	public String getCheckOutDate() {

		String checkoutdate = p.getProperty("checkoutdate");
		
		return checkoutdate;
	}
	
	
	
	
	
	
}
