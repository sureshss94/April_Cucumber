package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Dress {

	public WebDriver driver;
	
	@FindBy(xpath ="//a[@title='Women']")
	 private WebElement womenclick;
	
	@FindBy(xpath ="(//input[@type='checkbox'])[4]")
	private WebElement click1 ;
	
	@FindBy(xpath ="(//input[@type='button'])[4]")
	private WebElement click2 ;
	
	@FindBy(xpath ="//img[@title='Printed Dress']")
	private WebElement click3;
	
	@FindBy(xpath ="//iframe[@class='fancybox-iframe']")
	private WebElement frameswitch;
	
	@FindBy(name ="qty")
	private WebElement qty ;
	
	@FindBy(xpath ="//select[@name='group_1']")
	private WebElement dropdown ;
	
	@FindBy(xpath ="//a[@title='Proceed to checkout']")
	private WebElement click4;
	
	@FindBy(xpath ="(//a[@title='Proceed to checkout'])[2]")
	private WebElement click5;
	
	@FindBy(name ="processAddress")
	private WebElement click6;
	
	@FindBy(name ="cgv")
	private WebElement click7;
	
	@FindBy(name ="processCarrier")
	private WebElement click8;
	
	@FindBy(xpath ="//a[@class='bankwire']")
	private WebElement click9;

	@FindBy(name="Submit")
	private WebElement subbmitbtn ;
	
	public WebElement getSubbmitbtn() {
		return subbmitbtn;
	}
	@FindBy(xpath ="(//button[@type='submit'])[2]")
	private WebElement click10;

	public Women_Dress(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver,this);
	
	}

	public WebElement getWomenclick() {
		return womenclick;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getClick3() {
		return click3;
	}

	public WebElement getFrameswitch() {
		return frameswitch;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getClick4() {
		return click4;
	}

	public WebElement getClick5() {
		return click5;
	}

	public WebElement getClick6() {
		return click6;
	}

	public WebElement getClick7() {
		return click7;
	}

	public WebElement getClick8() {
		return click8;
	}

	public WebElement getClick9() {
		return click9;
	}

	public WebElement getClick10() {
		return click10;
	}
	
	
	
}
