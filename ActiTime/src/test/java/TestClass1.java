import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UtilityClasses.TakesScreen;

public class TestClass1 extends TestBase {
    
	@BeforeClass
	public void initialize()
	{
		
		HomePage hompage=new HomePage(driver);
	}
	@Test
	@Parameters({"Mobile"})
	public void test1(String M) throws IOException
	{
		
		homepage=new HomePage(driver);
		homepage.clickonLogin();
		homepage.sendmobile(M);
		homepage.clickonSubmit();
		TakesScreen ts=new TakesScreen();
		ts.ScreenShot(driver);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
