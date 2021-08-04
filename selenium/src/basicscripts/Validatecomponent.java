package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatecomponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
		WebElement f = driver.findElement(By.id("ap_email"));
		f.sendKeys("9912811114");
		if(f.isDisplayed()==true)
		{
			System.out.println("firstname is displayed");
		}
		else
		{
			System.out.println("firstname is not displayed");
		}
		if(f.isEnabled()==true)
		{
			System.out.println("firstname is enabled");
		}
		else
		{
			System.out.println("firstname is disabled");
		}
		driver.findElement(By.id("continue")).submit();
		WebElement c = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input"));
		//c.click();
		if(c.isSelected()==true)
		{
			System.out.println("is selected");
		
		}
		else
		{
			System.out.println("not selected");
		}
	
		
		
		

	}

}
