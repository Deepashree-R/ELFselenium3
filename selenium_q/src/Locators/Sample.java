package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Deepa");
		driver.findElement(By.id("userEmail")).sendKeys("Deepa@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Vijaynagar");
		driver.findElement(By.id("permanentAddress")).sendKeys("Bangalore");
		driver.findElement(By.id("submit")).click();
	}
}
