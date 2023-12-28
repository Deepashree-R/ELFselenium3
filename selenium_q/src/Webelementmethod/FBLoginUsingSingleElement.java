package Webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginUsingSingleElement {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
WebElement w1=driver.findElement(By.xpath("//input[@name='email']"));
w1.sendKeys("Deepa");
w1.sendKeys(Keys.TAB);
//w1.sendKeys("Deepa");
}
}
