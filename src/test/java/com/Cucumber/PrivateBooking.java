package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivateBooking 
{
	public PrivateBooking(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	private WebDriver driver;
	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement name;
	public WebElement getName() {
		return name;
	}

	@FindBy(xpath = "(//input[@class='login_input'])[2]")
	private WebElement pass;
	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement login;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement loc;
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement ronum;
	@FindBy(xpath = "(//input[@class='date_pick'])[1]")
	private WebElement checkin;
	@FindBy(xpath = "(//input[@class='date_pick'])[2]")
	private WebElement checkout;
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement person;
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;
	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	private WebElement search;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio;
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement contin;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lname;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement addres;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccnum;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement ctype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expmon;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expyr;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;

	public WebElement getContin() {
		return contin;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRonum() {
		return ronum;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getPerson() {
		return person;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
}
