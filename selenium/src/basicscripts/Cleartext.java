package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usr = driver.findElement(By.id("email"));
		//type1
		usr.sendKeys("jhbhsbsv");
		Thread.sleep(1000);
		//usr.clear();
		//type2
		usr.sendKeys(Keys.CONTROL+"a");
		usr.sendKeys(Keys.BACK_SPACE);
		

	}

}
