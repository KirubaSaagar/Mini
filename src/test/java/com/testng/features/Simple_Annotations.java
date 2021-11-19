package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeClass
	private void url() {

		System.out.println("Launching the url");
	}
	
	@BeforeTest
	private void browserlaunch() {

		System.out.println("Browser launch");
	}
	
	@BeforeSuite
	private void setproperty() {

		System.out.println("Set property");
	}
	
	@AfterClass
	private void homepage() {
		
        System.out.println("Home page");
	}
	
	@BeforeMethod
	private void signin() {

		System.out.println("Login");
	}
	
	@AfterMethod
	private void signoff() {

		System.out.println("Logout");
		
	}
	
	@AfterTest
	private void close() {

		System.out.println("close");
		
	}
	
	@AfterSuite
	private void cookies() {

		System.out.println("delete cookies");
	}
	
	@Test
	private void women() {
		
      System.out.println("women");
	}
	
	@Test
	private void tshirts() {

		System.out.println("Tshirts");
		
	}
	
	@Test
	private void dresses() {

		System.out.println("Dresses");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
