package Webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop_removefromcart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../following-sibling::div[3]/div[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//p[@class='content']"));
	boolean value=ele.isDisplayed();
	if(value)
	{
	driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	Thread.sleep(2000);
	}
	else
	{
		System.out.println("order cannot be placed");
	}
		}
	

}
