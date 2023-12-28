package Pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser3 {
public static void main(String[] args) throws InterruptedException, AWTException{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Robot r=new Robot();
	Thread.sleep(2000);
	
	
	for(int i=1; i<3; i++)
	{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
	}
	
	
	Set<String> all_id=driver.getWindowHandles();
	List<String> a1_ids=new LinkedList<String>(all_id);
	String first_tab=a1_ids.get(0);
	Thread.sleep(2000);
	driver.switchTo().window(first_tab);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	String second_tab=a1_ids.get(1);
	Thread.sleep(2000);
	driver.switchTo().window(second_tab);
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	String third_tab=a1_ids.get(2);
	Thread.sleep(2000);
	driver.switchTo().window(third_tab);
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
}
}
