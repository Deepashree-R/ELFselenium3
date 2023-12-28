package Handling_MouseHover_Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_Newtab {
public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement ele=driver.findElement(By.xpath("//a[@title='Kannada']"));
Actions act=new Actions(driver);
Thread.sleep(2000);
act.contextClick(ele).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_T);
Thread.sleep(2000);
r.keyRelease(KeyEvent.VK_T);

}
}
