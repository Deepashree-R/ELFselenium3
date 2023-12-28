package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jcip.annotations.ThreadSafe;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/gp/product/0143453580/ref=ox_sc_act_image_1?smid=A1WYWER0W24N8S&psc=1");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("You live only once book");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("img[src='https://m.media-amazon.com/images/I/71dNsRuYL7L._AC_UY218_.jpg']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='add-to-cart-button']")).click();
Thread.sleep(2000);
}
}
