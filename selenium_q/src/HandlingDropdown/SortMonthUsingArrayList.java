package HandlingDropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortMonthUsingArrayList {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[.='Create new account']")).click();
Thread.sleep(2000);
WebElement se=driver.findElement(By.xpath("//select[@id='month']"));
ArrayList<String> l=new ArrayList<String>();
Select s=new Select(se);
List<WebElement> options=s.getOptions();
for(WebElement option:options)
{
String text=option.getText();
l.add(text);
}
Collections.sort(l);
for(String l1:l)
{
	System.out.println(l1);
}
}
}
