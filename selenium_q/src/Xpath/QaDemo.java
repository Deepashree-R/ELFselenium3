package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Deepa");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Shree");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("deepa@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("123456789");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("subject");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Bangalore");
	Thread.sleep(2000);
}
}
