package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendarpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();                    
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(10000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(7);
		System.out.println("done");
		driver.findElement(By.xpath("/html/body/div/div[2]")).click();
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/div/a/i")).click();
		System.out.println("done");	
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		//driver.switchTo().frame(4);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/p[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[7]/div/p[4]")).click();
		
		//driver.close();

	}

}
