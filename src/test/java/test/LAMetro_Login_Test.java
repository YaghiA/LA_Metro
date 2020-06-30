package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.OpenBrowser;
import util.Wait;





public class LAMetro_Login_Test {
	WebDriver driver;
	
	@BeforeTest
	public void LoginPage() {
		driver = OpenBrowser.openBrowser("https://www.metroexpresslanes.net/");

	}
	
	@Test (priority = 1 )
	public void Login() throws InterruptedException {
		
		driver.findElement(By.xpath("//span/i")).click();
		Wait.waitForElement(driver, 20, By.xpath("//ul[@id='menu-top-menu']/li/a[@title='Login']"));
		driver.findElement(By.xpath("//ul[@id='menu-top-menu']/li/a[@title='Login']")).click();
		Wait.waitForElement(driver, 20, By.id("input_2"));
		driver.findElement(By.id("input_2")).sendKeys("dkerr");
		driver.findElement(By.id("input_3")).sendKeys("S@ndieg0");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Wait.waitForElement(driver, 20, By.xpath("//div[text()='Summary']"));
	}
	
	
	@Test (priority = 2 )
	public void LogOut() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@ng-bind='authentication.userName']")).click();
		Wait.waitForElement(driver, 20, By.xpath("//span[text()='Logout']"));
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
}
	
	@AfterTest
	public void Close() {
		driver.close();
		driver.quit();
		
		
		
		
	}
}