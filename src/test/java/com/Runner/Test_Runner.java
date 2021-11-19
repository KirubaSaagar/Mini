package com.Runner;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.nov.Base_Class;
import com.helper.File_Reader_Manager;
import com.pom.Account_Page;
import com.pom.Address;
import com.pom.Dress_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Payment;
import com.pom.Shipping;
import com.pom.Summary;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	static Logger log = Logger.getLogger(Test_Runner.class);
	
public static void main(String[] args) throws Throwable {
	
	PropertyConfigurator.configure("log4j.properties");
	
	String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
	
	getURL(url);
	
	log.info("URL Launched successfully");
	
	implicitWait(30);
	
	ClickOnElement(pom.getInstanceHp().getSignin_btn()); 
			
	String username = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Kiruba Saagar-TestCases.xlsx", 0, 23, 5);
	
	inputValueElement(pom.getInstanceLogin().getEmail(), username); 
			
	String password = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Kiruba Saagar-TestCases.xlsx", 0, 24, 5);
	
	inputValueElement(pom.getInstanceLogin().getPassword(), password); 
		
	ClickOnElement(pom.getInstanceLogin().getLogin_btn()); 
	
	log.info("Login successful");
		
	mouseActionsSelect("moveto", pom.getInstanceAp().getWomen()); 
		
	ClickOnElement(pom.getInstanceAp().getTshirt()); 
		
	scrollUpAndDown(pom.getInstanceDp().getDress());
		
	mouseActionsSelect("moveto", pom.getInstanceDp().getImage()); 
		
	mouseActionsSelect("click", pom.getInstanceDp().getQuickview()); 
		
    switchToFrame(pom.getInstanceDp().getFrame());
        
    dropdown(pom.getInstanceDp().getSize(), "byvalue", "2"); 
        
    ClickOnElement(pom.getInstanceDp().getColor()); 
        
    ClickOnElement(pom.getInstanceDp().getAddtocart()); 
    
    defaultContent(); 
    	
	ClickOnElement(pom.getInstanceDp().getPtc()); 
		
	ClickOnElement(pom.getInstanceSum().getPtc1()); 
		
	ClickOnElement(pom.getInstanceAdd().getPtc2()); 
		
	ClickOnElement(pom.getInstanceSh().getTerms()); 
		
	ClickOnElement(pom.getInstanceSh().getPtc3()); 
		
	ClickOnElement(pom.getInstancePay().getPayment()); 
		
	ClickOnElement(pom.getInstancePay().getFinalcheckout());
		
	scrollUpAndDown(pom.getInstancePay().getBack());
	
	screenShotName("min");
	
	log.info("Dress purchase successfully finished");
	
	quit();
	
	log.info("Session closed");
		
}

}
