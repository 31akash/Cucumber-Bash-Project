package com.Cucumber;

import org.openqa.selenium.WebDriver;

import com.Cucumber.POM;

public class BookingPage extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// PrivateBooking pb=new PrivateBooking(driver);

		driver = browserlaunch7("chrome");
		sleep7(3000);
		url7("http://adactinhotelapp.com/SearchHotel.php");
		POM p = new POM(driver);

		sendkeys7(p.getBp().getName(), "Akashadc7");

		sendkeys7(p.getBp().getPass(), "FC36LU");

		click7(p.getBp().getLogin());
		sleep7(3000);

		select_by_value7(p.getBp().getLoc(), "Melbourne");

		select_by_text7(p.getBp().getHotel(), "Hotel Sunshine");

		select_by_value7(p.getBp().getRoom(), "Super Deluxe");

		select_by_value7(p.getBp().getRonum(), "7");

		click7(p.getBp().getCheckin());

		click7(p.getBp().getCheckout());

		select_by_value7(p.getBp().getPerson(), "4");

		select_by_text7(p.getBp().getChild(), "2 - Two");

		click7(p.getBp().getSearch());
		sleep7(3000);

		click7(p.getBp().getRadio());

		click7(p.getBp().getContin());
		sleep7(3000);

		sendkeys7(p.getBp().getFname(), "Akash");

		sendkeys7(p.getBp().getLname(), "S");

		sendkeys7(p.getBp().getAddres(), "yr mugbhinjmlkl,ijobgnj ,lofijhunj ");

		sendkeys7(p.getBp().getCcnum(), "1234123412341234");

		select_by_value7(p.getBp().getCtype(), "VISA");

		select_by_value7(p.getBp().getExpmon(), "5");

		select_by_text7(p.getBp().getExpyr(), "2022");

		sendkeys7(p.getBp().getCvv(), "777");

		click7(p.getBp().getBook());
		to_screenshot7("C:\\Users\\sakas\\eclipse-workspace\\com.maven\\Screenshot\\hotel.png");
		close7();
	}
}
