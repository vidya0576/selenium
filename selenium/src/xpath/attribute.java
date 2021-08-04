package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///V:/work/selenium/css%20selector.html");
		driver.findElement(By.xpath("//input[@placeholder = 'UserName']")).sendKeys("admin");

	}

}
