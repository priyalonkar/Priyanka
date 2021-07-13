import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger Log;
	HomePage homepage;
	@org.testng.annotations.BeforeTest
	@Parameters("browser")
	public void BeforeTest(String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Java\\Automation\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("MicrosoftEdge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\Velocity\\Java\\msedgedriver.exe");

			// Start Edge Session
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com");
	}
	@BeforeClass
	public void setup()
	{
	Log = Logger.getLogger("ActiTime");
	PropertyConfigurator.configure("log4j.properties");
	Log.setLevel(Level.INFO);
	
	}

    
}
