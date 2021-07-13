package UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;



public class TakesScreen {
    
	public void ScreenShot(WebDriver driver) throws IOException
	{
    Date d=new Date();
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dfile=new File("E:\\pr"+d.toString().replace(":", "-")+".jpeg");
	
	Files.copy(file, dfile);
	}
	
	
	
}
