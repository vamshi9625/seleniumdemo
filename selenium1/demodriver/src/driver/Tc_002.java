package driver;

import org.openqa.selenium.By;

public class Tc_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
	 
	init();
    launch("chromebrowser");
	navigateUrl("hdfcurl");
     Thread.sleep(6000);
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Know More")).click();
	
	
	/*String title = driver.getTitle();
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.manage().deleteAllCookies();
	
	driver.navigate().back();
	
   Thread.sleep(4000);
	
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	driver.close();
*/	driver.quit();
	
	
	
	
	
	}
	
	

}
