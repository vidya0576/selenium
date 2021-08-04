package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		WebElement webdriver = driver.findElement(By.xpath("/html/body/div[7]/p/a"));
		int x = webdriver.getLocation().getX();
		int y = webdriver.getLocation().getY();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("scrollBy("+x+", "+y+")");
		

	}

}
