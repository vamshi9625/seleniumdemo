package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverLaunch 
{

	public static void main(String[] args) 
	
{
System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium\\geckodriver.exe" );
		WebDriver driver =new FirefoxDriver();	
	driver.get("https://www.amazon.in");
	}

}
