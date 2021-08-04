package basicscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.skyscanner.se/?");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"fsc-trip-type-selector-one-way\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fsc-origin-search\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fsc-origin-search\"]")).sendKeys("bengaluru");
	}

}
