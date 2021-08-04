package basicscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowactions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension s = driver.manage().window().getSize();
		Point p = driver.manage().window().getPosition();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().setPosition(p);
		
		driver.manage().window().setSize(s);
		Robot robot = new Robot();
		
		//close all windows and apps 
		//r.keyPress(KeyEvent.VK_WINDOWS);
		//r.keyPress(KeyEvent.VK_D);
		//r.keyRelease(KeyEvent.VK_D);
		
		// close browser window
		robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_SPACE);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_N);
	    Thread.sleep(2000);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.keyRelease(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_N);
		
	
	
				
		
		

	}

}
