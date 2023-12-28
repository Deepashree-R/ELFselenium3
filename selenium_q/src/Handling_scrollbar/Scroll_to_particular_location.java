package Handling_scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_to_particular_location {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/gp/product/0143453580/ref=ox_sc_act_image_1?smid=A1WYWER0W24N8S&psc=1");
	Thread.sleep(2000);
	WebElement twitter = driver.findElement(By.xpath("//a[.='Twitter']"));
	Point location = twitter.getLocation();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript(null, args)
}
}
