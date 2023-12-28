package Handling_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspiders_app {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/frames");
	Thread.sleep(2000);
	WebElement fr1 = driver.findElement(By.xpath("//iframe[@title='Login Form']"));
	driver.switchTo().frame(fr1);
	driver.findElement(By.id("username")).sendKeys("deepa");
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//li[.='Nested iframe']")).click();
	Thread.sleep(2000);
	//WebElement fr2 = driver.findElement(By.xpath("//iframe[1]"));
	driver.switchTo().frame(1);
	//driver.findElement(By.xpath("//section[@class='container']"));
	//driver.switchTo().
	driver.findElement(By.id("username")).sendKeys("deepa");
	Thread.sleep(2000);
	
	
}
}
