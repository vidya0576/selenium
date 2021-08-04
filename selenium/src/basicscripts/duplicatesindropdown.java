package basicscripts;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicatesindropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///V:/work/selenium/dropdown.html");
		//selecting by select class
		
		WebElement dropdown = driver.findElement(By.id("sel1"));
		Select s = new Select(dropdown);
		List<WebElement> alloptions = s.getOptions();
		HashSet h1 = new HashSet();
		for(int i = 0;i<alloptions.size(); i++)
		{
			String options = alloptions.get(i).getText();
			
			//to print duplicate options
			if(h1.add(options)==false)
			{
				System.out.println("duplicate option"+options);
			}
			
		}
		System.out.println("unique"+h1);//unique options
		System.out.println(h1);
		
		// to check if there are duplicates
		if(alloptions.size()>h1.size())
		{
			System.out.println("there are duplicates");
		}
		else
		{
			System.out.println("There are no duplicates");
		}
		
	}

}
