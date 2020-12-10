package screenshort;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import driver.BaseTest;

public class Selfy3 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
	init();	
	
	launch("chromebrowser");

	navigateUrl("googleurl");

	List <WebElement> links = driver.findElements(By.tagName("a"));

	for(int i=0;i<links.size();i++)
	{
		if(!links.get(i).getText().isEmpty())
		{
			String linkName = links.get(i).getText();
			driver.findElement(By.linkText(linkName)).click();
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\user\\OneDrive\\Desktop\\screenshort\\"+linkName+".png"));
			driver.navigate().back();
			links = driver.findElements(By.tagName("a"));
		}
	
	   }
	}

}
