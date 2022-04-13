package com.helper.manager;

import org.openqa.selenium.WebDriver;

import com.pom1.Automation_login;
import com.pom1.Dress_Purchase;
import com.pom1.Purchas_Over;
import com.pom1.Women_Dress;

public class Page_Objectmanager1 {
	
	public WebDriver driver;
	
	private Automation_login Addtocart;
	private Purchas_Over over;
	private Women_Dress women;
	
	private Dress_Purchase dress;
	
	
	public Page_Objectmanager1(WebDriver driver2) {
		this.driver	=driver2;
	}
	public Purchas_Over get_instance_over() {
		
		if (over==null) {
		over = new Purchas_Over(driver);
		}
		
		
		return over;
		
	}
	public Automation_login get_instance_Addtocart() {
		
		if (Addtocart==null) {
			Addtocart = new Automation_login(driver);
		}
		
		return Addtocart;
		
	}
	public Women_Dress get_Instance_women() {
		if (women==null) {
			women = new Women_Dress(driver);
			
		}
		
		return women;
	}
	public Dress_Purchase get_Instance_dress() {

		if (dress==null) {
			
			dress =new Dress_Purchase(driver);
		}
		return dress;
	}

}
