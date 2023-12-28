package Pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Child_Browser2 {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	
	WebElement ele1=driver.findElement(By.xpath("//span[.='Downloads']"));
	WebElement ele2=driver.findElement(By.xpath("//span[.='Documentation']"));
	WebElement ele3=driver.findElement(By.xpath("//span[.='Projects']"));
	WebElement ele4=driver.findElement(By.xpath("//span[.='Support']"));
	WebElement ele5=driver.findElement(By.xpath("//span[.='Blog']"));
	
	ArrayList<WebElement> l=new ArrayList<WebElement>();
	l.add(ele1);
	l.add(ele2);
	l.add(ele3);
	l.add(ele4);
	l.add(ele5);
	
	Actions act=new Actions(driver);
	Robot r=new Robot();
	
	for(WebElement l1:l)
	{
		act.contextClick(l1).perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	Set<String> allwh=driver.getWindowHandles();
	for(String wh:allwh)
	{
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		//String title=driver.getTitle();
		//System.out.println(title);
	}
}
}
