package Webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassAndClearValue {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/DEEPA%20PRASAD/OneDrive/Desktop/selenium/FN.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("(//input)[1]"));
	ele.sendKeys("deepa");
	Thread.sleep(1000);
	ele.clear();
	Thread.sleep(1000);
	ele=driver.findElement(By.xpath("(//input)[2]"));
	ele.sendKeys("shree");
	Thread.sleep(1000);
	ele.clear();
	Thread.sleep(1000);
	ele=driver.findElement(By.xpath("(//input)[3]"));
	ele.sendKeys("deepa@gmail.com");
	Thread.sleep(1000);
	ele.clear();
	Thread.sleep(1000);
	
}
}
