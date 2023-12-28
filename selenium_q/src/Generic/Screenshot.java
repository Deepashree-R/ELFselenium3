package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void getscreenshot(WebDriver driver) throws IOException
{
	Date d=new Date();
	String dat=d.toString().replaceAll(":", "-");
	TakesScreenshot tss=(TakesScreenshot) driver;
	File source=tss.getScreenshotAs(OutputType.FILE);
	File destination=new File("./photo/"+dat+".jpg");
	FileHandler.copy(source, destination);
	
}
}
