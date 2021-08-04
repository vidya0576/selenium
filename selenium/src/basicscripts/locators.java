package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///V:/work/selenium/locators.html");
		driver.findElement(By.id("usr")).sendKeys("admin121");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.className("email")).sendKeys("abc@gmail.com");
		
		//open in new tab
		 WebElement acti = driver.findElement(By.linkText("login to actiTIME"));
		 String newt = Keys.CONTROL+Keys.SHIFT.toString()+Keys.ENTER.toString();
		 acti.sendKeys(newt);
		
		

	}

}
