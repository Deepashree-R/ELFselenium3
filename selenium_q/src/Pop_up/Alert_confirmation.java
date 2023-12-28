package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_confirmation {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/alerts");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='alertButton']")).click();
Thread.sleep(2000);
Alert alert=driver.switchTo().alert();
Thread.sleep(2000);
alert.accept();
String text=alert.getText();
System.out.println(text);

}
}
