package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("file:///V:/work/selenium/css%20selector.html");
		driver.findElement(By.cssSelector("input[placeholder = 'UserName']")).sendKeys("admin");
		//driver.findElement(By.cssSelector("body > input[type=text]:nth-child(2)")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys("manager");
	}

}
