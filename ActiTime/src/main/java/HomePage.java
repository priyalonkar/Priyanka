import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath="//a[text()='Login']")
	private WebElement login;
	
	@FindBy (xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy (xpath="//a[@class='a-ayg']")
	private WebElement submit_login;
	
	@FindBy (xpath="//input[@id='otp']")
	private WebElement otp;
	
	@FindBy (xpath="//a[@class='a-ayg']")
	private WebElement otpverify;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonLogin()
	{
		login.click();
	}
	
	public void sendmobile(String usermobile)
	{
		mobile.sendKeys(usermobile);
	}
	
	public void clickonSubmit()
	{
		submit_login.click();
	}
	

}
