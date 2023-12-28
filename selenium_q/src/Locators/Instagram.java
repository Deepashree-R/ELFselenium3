package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("deepa__prasad");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("12345");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[aria-label='Search input']")).sendKeys("niranjan_Ka_18");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("svg[aria-label='Search']")).click();
	
}
}
