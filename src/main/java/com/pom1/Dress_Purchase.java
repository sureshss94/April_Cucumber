package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Purchase {

	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	
	private WebElement dressclick;
	
	@FindBy(xpath = "//input[@id='layered_category_10']")
	
	private WebElement click;
	
	@FindBy(xpath = "//img[@title='Printed Dress']")
	
	private WebElement click1;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	
	private WebElement frame;
	
	@FindBy(name = "qty")
	
	private WebElement qty;
	
	@FindBy(xpath = "//select[@name='group_1']")
	
	private WebElement dropdown;
	
	@FindBy(name ="Submit")
	private WebElement submit1;
	
	public WebElement getSubmit1() {
		return submit1;
	}

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	
	private WebElement click2;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement click3;
	
	@FindBy(name = "processAddress")
	
	private WebElement click4;
	
	@FindBy(name = "cgv")
	
	private WebElement click5;
	
	@FindBy(name = "processCarrier")
	
	private WebElement click6;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	
	
	private WebElement click7;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	
	private WebElement click8;

	public Dress_Purchase(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getDressclick() {
		return dressclick;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getClick3() {
		return click3;
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
	
	
}
