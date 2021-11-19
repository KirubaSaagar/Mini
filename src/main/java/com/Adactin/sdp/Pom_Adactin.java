package com.Adactin.sdp;

import org.openqa.selenium.WebDriver;

import com.Adactin.AdaLogin_Page;
import com.Adactin.Book_Hotel;
import com.Adactin.Search_Hotel;
import com.Adactin.Select_Hotel;

public class Pom_Adactin {
	
	public WebDriver driver;
	
	private AdaLogin_Page lp;
	
	private Book_Hotel bh;
	
	private Search_Hotel sear;
	
	private Select_Hotel sel;

	public Pom_Adactin(WebDriver driver2) {

	this.driver = driver2;
	
	}

	public AdaLogin_Page getInstanceLp() {
		
		if (lp==null) {
			
			lp= new AdaLogin_Page(driver);
			
		}
		return lp;
	}

	public Book_Hotel getInstanceBh() {
		
		if (bh== null) {
			
			bh = new Book_Hotel(driver);
			
		}
		return bh;
	}

	public Search_Hotel getInstanceSear() {
		
		if (sear==null) {
			
			sear = new Search_Hotel(driver);
			
		}
		return sear;
	}

	public Select_Hotel getInstanceSel() {
		
		if (sel==null) {
			
			sel = new Select_Hotel(driver);
			
		}
		return sel;
	}
	
	
	
	

}
