package test;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import util.OpenBrowser;

public class LAMetro_Login_Test {
	WebDriver driver;
	
	@Test
	public void LoginPage() {
		driver = OpenBrowser.openBrowser("https://www.metroexpresslanes.net/ ");

	}
}
