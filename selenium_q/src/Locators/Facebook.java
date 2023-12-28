package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Deepa");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("password@123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();

}
}
