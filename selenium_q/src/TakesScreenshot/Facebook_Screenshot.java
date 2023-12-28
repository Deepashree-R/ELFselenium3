package TakesScreenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Screenshot;

public class Facebook_Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("deepa@gmail.com");
Thread.sleep(2000);
Screenshot.getscreenshot(driver);
driver.findElement(By.id("password")).sendKeys("deepa");
Thread.sleep(2000);
Screenshot.getscreenshot(driver);
}
}
