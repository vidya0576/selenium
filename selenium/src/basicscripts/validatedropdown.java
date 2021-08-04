package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class validatedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///V:/work/selenium/dropdown.html");
		WebElement dropdown = driver.findElement(By.id("sel2"));
		Select s = new Select(dropdown);
		if(s.isMultiple()==true)
		{
			System.out.println("dropdown is multiple select");
		}
		else
		{
			System.out.println("dropdown is single select");
		}

	}

}
