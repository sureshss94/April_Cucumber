package com.sd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.automationfile.Test_Runner;
import com.base.Base_Class;
import com.configuration.helper.File_Reader_Manager;
import com.helper.manager.Page_Objectmanager1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;

	public static Page_Objectmanager1 pom = new Page_Objectmanager1(driver);

	@Given("user launch The Application")
	public void user_launch_the_application() throws IOException {

		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Url();
		getUrl(url);

	}

	@When("user Click The Login Button navigate to the login page")
	public void user_click_the_login_button_navigate_to_the_login_page() {
		clickonElement("click", pom.get_instance_Addtocart().getLogin_btn());

	}

	@When("User Enter The username")
	public void user_enter_the_username() {
		inputValueElement(pom.get_instance_Addtocart().getEmail(), "sureshsow2@gmail.com");
	}

	@When("user Enter The password")
	public void user_enter_the_password() {
		inputValueElement(pom.get_instance_Addtocart().getPassword(), "abcd2345");

	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		clickonElement("click", pom.get_instance_Addtocart().getLogin_btn1());
	}

	@When("user Click The Tshirt Button")
	public void user_click_the_tshirt_button() {
		clickonElement("click", pom.get_instance_Addtocart().getTshirtbtn());
	}

	@When("user Click the Size Checkbox")
	public void user_click_the_size_checkbox() {
		clickonElement("click", pom.get_instance_Addtocart().getCheckbox1());
	}

	@When("User Click the button")
	public void user_click_the_button() {
		clickonElement("click", pom.get_instance_Addtocart().getBtn());

	}

	@When("User Click The Checkbox2 Button")
	public void user_click_the_checkbox2_button() {
		clickonElement("click", pom.get_instance_Addtocart().getCheckbox2());
	}

	@When("user click The Desired Image")
	public void user_click_the_desired_image() throws Exception {
		Actionclass("moveto", pom.get_instance_Addtocart().getImgclick());
		Actionclass("clickon", pom.get_instance_Addtocart().getImgclick());
		waitbrowser("wait", 10);
	}

	@When("user Enter the 1Framebox")
	public void user_enter_the_1framebox() {
		frameswitchTo("singleframe", pom.get_instance_Addtocart().getFramein());

	}

	@When("user Clear and Enter The 1Quantity")
	public void user_clear_and_enter_the_1quantity() {
		clickonElement("clear", pom.get_instance_Addtocart().getQuantity());
		inputValueElement(pom.get_instance_Addtocart().getQuantity(), "2");
	}

	@When("user Select The Sizeok")
	public void user_select_the_sizeok() {
		dropdown("byindex", pom.get_instance_Addtocart().getSize(), "1");
	}

	@When("user Click The Colour Prefrence Button")
	public void user_click_the_colour_prefrence_button() {
		clickonElement("click", pom.get_instance_Addtocart().getColour());

	}

	@When("user Click The Addtocart Button")
	public void user_click_the_addtocart_button() {
		clickonElement("click", pom.get_instance_Addtocart().getSubmitbtn());

	}

	@When("user Release The frame And Click The Checkout 1Button")
	public void user_release_the_frame_and_click_the_checkout_1button() {
		frameswitchTo("defaultcontent", pom.get_instance_Addtocart().getFramein());
		clickonElement("click", pom.get_instance_Addtocart().getCheckout());

	}

	@When("user Move Down And Click Proceed to Checkout 1Button")
	public void user_move_down_and_click_proceed_to_checkout_1button() throws Exception {

		Actionclass("moveto", pom.get_instance_over().getMoveto());

		waitbrowser("wait", 10);

		Actionclass("moveto", pom.get_instance_over().getMovedown());
		Actionclass("clickon", pom.get_instance_over().getMovedown());

	}

	@When("user Click THE Button Checkout11")
	public void user_click_the_button_checkout11() throws Exception {
		clickonElement("click", pom.get_instance_over().getBtn1());

		waitbrowser("wait",10);

	}

	@When("user Click THE Button Checkout12")
	public void user_click_the_button_checkout12() {
		clickonElement("click", pom.get_instance_over().getBtn2());
	}

	@When("user Click THE Button Checkout13")
	public void user_click_the_button_checkout13() throws Exception {
		clickonElement("click", pom.get_instance_over().getBtn3());
		waitbrowser("wait",10);
	}
	
	@When("user Click THE Button Checkout14")
	public void user_click_the_button_checkout14() throws Exception {
		waitbrowser("longwait",10);

		clickonElement("click", pom.get_instance_over().getBtn4());
		waitbrowser("wait",10);

	}

	@When("user Click THE Button Checkout15")
	public void user_click_the_button_checkout15() throws Exception {
		Actionclass("moveto", pom.get_instance_over().getMove_click());
		Actionclass("clickon", pom.get_instance_over().getMove_click());
		waitbrowser("wait",10);

	}

	@Then("user Click The Logout Button Navigate To Homepage1")
	public void user_click_the_logout_button_navigate_to_homepage1() {
		clickonElement("click", pom.get_instance_over().getLogout());
	}

	@When("user Click The Women Button")
	public void user_click_the_women_button() {
		clickonElement("click", pom.get_Instance_women().getWomenclick());

	}

	@When("user Click the  Checkbox11")
	public void user_click_the_checkbox11() {
		clickonElement("click", pom.get_Instance_women().getClick1());

	}

	@When("User Click the button2")
	public void user_click_the_button2() throws Exception {
		waitbrowser("longwait", 5000);

		clickonElement("click", pom.get_Instance_women().getClick2());

	}

	@When("user click The Desired Image13")
	public void user_click_the_desired_image13() {
		clickonElement("click", pom.get_Instance_women().getClick3());

	}

	@When("user Enter the Framebox1")
	public void user_enter_the_framebox1() throws Exception {
		frameswitchTo("singleframe", pom.get_Instance_women().getFrameswitch());
		waitbrowser("longwait", 5000);

	}

	@When("user Clear and Enter The Quantity1")
	public void user_clear_and_enter_the_quantity1() throws Exception {
		clickonElement("clear", pom.get_Instance_women().getQty());

		inputValueElement(pom.get_Instance_women().getQty(), "2");
		waitbrowser("longwait", 5000);

	}

	@When("user Select The Size1")
	public void user_select_the_size1() {
		dropdown("byvalue", pom.get_Instance_women().getDropdown(), "2");

	}

	@When("user Click The Submmit Button1")
	public void user_click_the_submmit_button1() {

		clickonElement("click", pom.get_Instance_women().getSubbmitbtn());
	}

	@When("user Release The frame And Click The Checkout Button1")
	public void user_release_the_frame_and_click_the_checkout_button1() throws Exception {
		frameswitchTo("defaultcontent", pom.get_Instance_women().getClick3());
		waitbrowser("longwait", 5000);
		clickonElement("click", pom.get_Instance_women().getClick4());

	}

	@When("user Move Down And Click Proceed to Checkout Button1")
	public void user_move_down_and_click_proceed_to_checkout_button1() {

		clickonElement("click", pom.get_Instance_women().getClick5());

	}

	@When("user Click THE Button Checkout111")
	public void user_click_the_button_checkout111() {
		clickonElement("click", pom.get_Instance_women().getClick6());

	}

	@When("user Click THE Button Checkout21")
	public void user_click_the_button_checkout21() {
		clickonElement("click", pom.get_Instance_women().getClick7());

	}

	@When("user Click THE Button Checkout23")
	public void user_click_the_button_checkout23() {
		clickonElement("click", pom.get_Instance_women().getClick8());

	}

	@When("user Click THE Button Checkout24")
	public void user_click_the_button_checkout24() {
		clickonElement("click", pom.get_Instance_women().getClick9());
	}

	@When("user Click THE Button Checkout25")
	public void user_click_the_button_checkout25() {
		clickonElement("click", pom.get_Instance_women().getClick10());

	}

	@Then("user Click The Logout Button Navigate To 2Homepage")
	public void user_click_the_logout_button_navigate_to_2homepage() {
		clickonElement("click", pom.get_instance_over().getLogout());
	}

	@When("user Click The Dress Button")
	public void user_click_the_dress_button() {
		
		clickonElement("click", pom.get_Instance_dress().getDressclick());

		
		
	}

	@When("user Click the  Checkbox1")
	public void user_click_the_checkbox1() throws Exception {
		clickonElement("click", pom.get_Instance_dress().getClick());

		waitbrowser("longwait", 5000);
	}

	@When("user click The Desired Image3")
	public void user_click_the_desired_image3() {
		clickonElement("click", pom.get_Instance_dress().getClick1());
	}

	@When("user Enter the Framebox")
	public void user_enter_the_framebox() {
		frameswitchTo("singleframe", pom.get_Instance_dress().getFrame());


	}

	@When("user Clear and Enter The Quantity")
	public void user_clear_and_enter_the_quantity() {
clickonElement("clear", pom.get_Instance_dress().getQty());
		
		inputValueElement(pom.get_Instance_dress().getQty(), "2");

	}

	@When("user Select The Size")
	public void user_select_the_size() {
		dropdown("byvalue", pom.get_Instance_dress().getDropdown(), "2");
		
	}

	@When("user Click The Submmit Button")
	public void user_click_the_submmit_button() throws Exception {
waitbrowser("longwait", 5000);
		
		clickonElement("click", pom.get_Instance_dress().getSubmit1());
	}

	@When("user Release The frame And Click The Checkout Button")
	public void user_release_the_frame_and_click_the_checkout_button() throws Exception {
driver.switchTo().defaultContent();
		
		waitbrowser("longwait", 3000);
		clickonElement("click", pom.get_Instance_dress().getClick2());
		waitbrowser("longwait", 3000);
	}

	@When("user Move Down And Click Proceed to Checkout Button")
	public void user_move_down_and_click_proceed_to_checkout_button() {
		clickonElement("click", pom.get_Instance_dress().getClick3());
		
	}

	@When("user Click THE Button Checkout1")
	public void user_click_the_button_checkout1() {
		
		clickonElement("click", pom.get_Instance_dress().getClick4());	

		
	}

	@When("user Click THE Button Checkout2")
	public void user_click_the_button_checkout2() {
		clickonElement("click", pom.get_Instance_dress().getClick5());
			}

	@When("user Click THE Button Checkout3")
	public void user_click_the_button_checkout3() {
		
		
		clickonElement("click", pom.get_Instance_dress().getClick6());
		

	}

	@When("user Click THE Button Checkout4")
	public void user_click_the_button_checkout4() {
		clickonElement("click", pom.get_Instance_dress().getClick7());
	}

	@Then("user Click The Logout Button Navigate To Homepage")
	public void user_click_the_logout_button_navigate_to_homepage() {
		clickonElement("click", pom.get_instance_over().getLogout());

	}

}