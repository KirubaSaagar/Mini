package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Account_Page;
import com.pom.Address;
import com.pom.Dress_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Payment;
import com.pom.Shipping;
import com.pom.Summary;

public class Page_Object_Manager {
	
	public WebDriver driver; //--->null
	
	private Home_Page hp; //--->null
	
	private Login_Page login;
	
	private Account_Page ap;
	
	private Dress_Page dp;
	
	private Summary sum;
	
	private Address add;
	
	private Shipping sh;
	
	private Payment pay;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public Home_Page getInstanceHp() {
		
		if (hp==null) {
			
			hp = new Home_Page(driver);
			
		}
		return hp;
	}

	public Login_Page getInstanceLogin() {
		
		if (login==null) {
			
			login = new Login_Page(driver);
			
		}
		return login;
	}

	public Account_Page getInstanceAp() {
		
		if (ap==null) {
			
			ap = new Account_Page(driver);
			
		}
		return ap;
	}

	public Dress_Page getInstanceDp() {
		
		if (dp==null) {
			
			dp = new Dress_Page(driver);
			
		}
		return dp;
	}

	public Summary getInstanceSum() {
		
		if (sum==null) {
			
			sum = new Summary(driver);
			
		}
		return sum;
	}

	public Address getInstanceAdd() {
		
		if (add==null) {
			
			add = new Address(driver);
			
		}
		return add;
	}

	public Shipping getInstanceSh() {
		
		if (sh==null) {
			
			sh = new Shipping(driver);
			
		}
		return sh;
	}

	public Payment getInstancePay() {
		
		if (pay==null) {
			
			pay = new Payment(driver);
		}
		return pay;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
