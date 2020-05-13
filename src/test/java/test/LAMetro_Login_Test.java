package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;







public class LAMetro_Login_Test {
	WebDriver driver;
	
	@BeforeTest
	public void LoginPage() {
		driver.get("https://www.metroexpresslanes.net/");

	}
	
	@Test (priority = 1 )
	public void Login() throws InterruptedException {
		
		driver.findElement(By.xpath("//span/i")).click();
		
		//Wait.waitForElement(driver, 20, By.xpath("//ul[@id='menu-top-menu']/li/a[@title='Login']"));
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='menu-top-menu']/li/a[@title='Login']")));
		driver.findElement(By.xpath("//ul[@id='menu-top-menu']/li/a[@title='Login']")).click();
		
		//Wait.waitForElement(driver, 20, By.id("input_2"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input_2")));
		
		driver.findElement(By.id("input_2")).sendKeys("KerrSmoke");
		driver.findElement(By.id("input_3")).sendKeys("S@ndieg0");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//	Wait.waitForElement(driver, 20, By.xpath("//div[text()='Summary']"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Summary']")));
	}
	
	
	@Test (priority = 2 )
	public void LogOut() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@ng-bind='authentication.userName']")).click();
		
		//Wait.waitForElement(driver, 20, By.xpath("//span[text()='Logout']"));
		
		WebDriverWait wait2 = new WebDriverWait(driver , 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Logout']")));
		
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
}
	
	@AfterTest
	public void Close() {
		driver.close();
		driver.quit();
		
		
		
		
	}
}