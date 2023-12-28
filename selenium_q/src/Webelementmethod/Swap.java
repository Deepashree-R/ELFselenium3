package Webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swap {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/DEEPA%20PRASAD/OneDrive/Desktop/selenium/swap.html");
	Thread.sleep(1000);
	WebElement w1=driver.findElement(By.xpath("//input[@value='API']"));
	/*w1.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(1000);
	WebElement w3=driver.findElement(By.xpath("//input[3]"));
	w3.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(1000);
	WebElement w2=driver.findElement(By.xpath("//input[@value='Selenium']"));
	w2.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(1000);
	w1.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(1000);
	w3.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(1000);
	w2.sendKeys(Keys.CONTROL+"v");*/
	w1.sendKeys(Keys.ALT+"f4");
}
}
