package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshopRegister {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='gender-female']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Deepa");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Shree");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("deepashree0124@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("password@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/logout']")).click();
	Thread.sleep(2000);
	
}
}
