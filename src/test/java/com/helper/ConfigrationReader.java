package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigrationReader {
	public static Properties p;

	public ConfigrationReader() throws Throwable {
		File f = new File(
				"C:\\Users\\sakas\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\properties\\Properties");
		FileInputStream fs = new FileInputStream(f);
		p = new Properties();
		p.load(fs);
	}

	public String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;

	}

	public String getUrl() {

		String url = p.getProperty("Url");
		return url;
	}

	public String getUsername() {
		String username = p.getProperty("Username");
		return username;
	}

	public String getPassword() {
		String pword = p.getProperty("Password");
		return pword;
	}

	public String getAddress() {
		String address = p.getProperty("Address");
		return address;
	}

	public String getCardnumber() {
		String cnumber = p.getProperty("Cardnumber");
		return cnumber;
	}

	public String getCardtype() {
		String ctype = p.getProperty("Cardtype");
		return ctype;
	}

	public String getExpmonth() {
		String exmonth = p.getProperty("Expmonth");
		return exmonth;
	}

	public String getExpyear() {
		String exyear = p.getProperty("Expyear");
		return exyear;
	}

	public String getCvv() {
		String cvv = p.getProperty("Cvv");
		return cvv;
	}

	public String getLocation() {
		String loc = p.getProperty("Location");
		return loc;
	}

	public String getHotel() {
		String hotel = p.getProperty("Hotel");
		return hotel;
	}

	public String getRoomtype() {
		String rtype = p.getProperty("Roomtype");
		return rtype;
	}

	public String getNumberrooms() {
		String rooms = p.getProperty("Numberrooms");
		return rooms;
	}

	public String getNumberadult() {
		String adult = p.getProperty("Numberadult");
		return adult;
	}

	public String getNumberchild() {
		String child = p.getProperty("Numberchild");
		return child;
	}

}
