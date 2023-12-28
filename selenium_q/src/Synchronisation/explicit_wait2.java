package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
//	wait.until(ExpectedConditions.titleContains(""));
//	driver.findElement(By.id("email")).sendKeys("deepa@gmail.com");
	
//	wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
//	driver.findElement(By.id("email")).sendKeys("deepa@gmail.com");
	
	WebElement ele=driver.findElement(By.id("email"));
	wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("dee@gmail.com");
}
}
