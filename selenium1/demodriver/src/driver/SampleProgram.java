package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleProgram
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
 
	     driver.get("https://www.amazon.in");

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium\\geckodriver.exe");
		WebDriver driver1 =new FirefoxDriver();
	 
		driver1.get("https://www.flipkart.in");
	
		
		//webdriver.ie.driver
		//webdriver.edge.driver
	}

}
