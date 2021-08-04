package basicscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ValidateWebpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		//validate by title
		String eTitle = "Log";
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		if(aTitle.contains(eTitle))
		{
			System.out.println("login page is displayed");
		}
		else
		{
			System.out.println("login page is not displayed");
		}
		
		// validate by Url
		String eUrl = "facebook.com";
		String aUrl = driver.getCurrentUrl();
		System.out.println(aUrl);
		if(aUrl.contains(eUrl))
		{
			System.out.println("Url is displayed");
		}
		else
		{
			System.out.println("Url is not displayed");
		}
		//validate by screenshot
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dst = new File("V:\\work\\selenium\\screenshots\\"+aTitle+".png");
		FileHandler.copy(src, dst);
		driver.close();
		
		}
	
}
