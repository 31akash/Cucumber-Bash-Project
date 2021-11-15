package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Cucumber.BaseClass;
import com.Cucumber.Login;
import com.Cucumber.PrivateBooking;
import com.Cucumber.PrivateLoginPage;
import com.helper.ConfigrationReader;
import com.helper.FileReaderManager;
import com.runner.AdactinRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass
{
	
	public static WebDriver driver=AdactinRunner.driver;
	PrivateLoginPage lp=new PrivateLoginPage(driver);
	PrivateBooking bp=new PrivateBooking(driver);
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable 
	{
	String url = FileReaderManager.getInstanceCR().getUrl();
	url7(url);
	}
   
	@When("^user enters the valid username in the field$")
	public void user_enters_the_valid_username_in_the_field() throws Throwable 
	{
		String uname = FileReaderManager.getInstanceCR().getUsername();
	sendkeys7(lp.getName(),uname);     
	}

	@When("^user enters the valid password in the field$")
	public void user_enters_the_valid_password_in_the_field() throws Throwable 
	{String paword = FileReaderManager.getInstanceCR().getPassword();
	sendkeys7(lp.getPass(), paword);   
	}

	@Then("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable 
	{

	click7(lp.getLogin());    
	}
	@Given("^user navigates to booking psge$")
	public void user_navigates_to_booking_psge() throws Throwable {
	   
	}

	@When("^user selects the location$")
	public void user_selects_the_location() throws Throwable 
	{
		String location = FileReaderManager.getInstanceCR().getLocation();
		sendkeys7(bp.getLoc(),location);
	}
	@When("^user selects the hotel$")
	public void user_selects_the_hotel() throws Throwable 
	{
		String hotel = FileReaderManager.getInstanceCR().getHotel();
		sendkeys7(bp.getHotel(),hotel); 
	}


	@When("^user selects the room type$")
	public void user_selects_the_room_type() throws Throwable 
	{
		String roomtype = FileReaderManager.getInstanceCR().getRoomtype();  
		sendkeys7(bp.getRoom(), roomtype);
	}

	@When("^user selects the number of rooms$")
	public void user_selects_the_number_of_rooms() throws Throwable 
	{
		String numberrooms = FileReaderManager.getInstanceCR().getNumberrooms();
		sendkeys7(bp.getRonum(),numberrooms);
	}

	@When("^user selects  the checkin date$")
	public void user_selects_the_checkin_date() throws Throwable 
	{
	click7(bp.getCheckin());   
	}

	@When("^user selects the checkout date$")
	public void user_selects_the_checkout_date() throws Throwable 
	{
	click7(bp.getCheckout());   
	}

	@When("^user selects the number of adults$")
	public void user_selects_the_number_of_adults() throws Throwable 
	{
		String numberadult = FileReaderManager.getInstanceCR().getNumberadult();
		sendkeys7(bp.getPerson(), numberadult); 
	}

	@When("^user selects the number of childs$")
	public void user_selects_the_number_of_childs() throws Throwable 
	{
		String numberchild = FileReaderManager.getInstanceCR().getNumberchild();
		sendkeys7(bp.getChild(),numberchild);
	}

	@When("^user clicks the search  button$")
	public void user_clicks_the_search_button() throws Throwable 
	{
	   click7(bp.getSearch()); 
	}

	@When("^user clicks the confirm button$")
	public void user_clicks_the_confirm_button() throws Throwable 
	{
	    click7(bp.getRadio());
	}

	@When("^user clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable 
	{
	   click7(bp.getContin());
	}

	@When("^user types the first name$")
	public void user_types_the_first_name() throws Throwable 
	{
	   sendkeys7(bp.getFname(), "Akash");
	}

	@When("^user types the last name$")
	public void user_types_the_last_name() throws Throwable 
	{
	sendkeys7(bp.getLname(),"S");    
	}

	@When("^user types the address$")
	public void user_types_the_address() throws Throwable 
	{
		String address = FileReaderManager.getInstanceCR().getAddress();
		sendkeys7(bp.getAddres(),address);
	}

	@When("^user types the credit card number$")
	public void user_types_the_credit_card_number() throws Throwable 
	{
		String cardnumber = FileReaderManager.getInstanceCR().getCardnumber();
		sendkeys7(bp.getCcnum(), cardnumber);
	}

	@When("^user selects the card type$")
	public void user_selects_the_card_type() throws Throwable 
	{
		String cardtype = FileReaderManager.getInstanceCR().getCardtype();
		sendkeys7(bp.getCtype(),cardtype);
	}

	@When("^user selects the expiry month$")
	public void user_selects_the_expiry_month() throws Throwable 
	{
		String expmonth = FileReaderManager.getInstanceCR().getExpmonth();
		sendkeys7(bp.getExpmon(),expmonth);
	}

	@When("^user selects the expiry year$")
	public void user_selects_the_expiry_year() throws Throwable 
	{
		String expyear = FileReaderManager.getInstanceCR().getExpyear();
		sendkeys7(bp.getExpyr(),expyear);
	}

	@When("^user types the cvv$")
	public void user_types_the_cvv() throws Throwable 
	{
		String cvv = FileReaderManager.getInstanceCR().getCvv();
		sendkeys7(bp.getCvv(),cvv);
	}

	@When("^user clicks the booknow button$")
	public void user_clicks_the_booknow_button() throws Throwable 
	{
	  click7(bp.getBook());
	}

}
