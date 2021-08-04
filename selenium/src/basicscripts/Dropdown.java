package basicscripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///V:/work/selenium/dropdown.html");
		//selecting by select class
		
		WebElement dropdown = driver.findElement(By.id("sel1"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		s.selectByIndex(2);
		//s.selectByValue("selenium");
		//s.selectByVisibleText("Manual");
		//s.deselectByIndex(2);
		
		// retrieving selected options
		
		//address format
		 List<WebElement> selected = s.getAllSelectedOptions();
		 System.out.println(selected);
		 ArrayList s1 = new ArrayList();
		 
		 //text format by index
		 for(int i = 0;i<selected.size();i++)
		 {
			String selected_text = selected.get(i).getText();
			System.out.println(selected_text);
			s1.add(selected_text);
		 }
		 Collections.sort(s1);
		 System.out.println(s1);
		 	
		//retrieving all options
		 List<WebElement> alloptions = s.getOptions();
		 System.out.println(alloptions);
		 ArrayList all1 = new ArrayList();
		 
		 for(int o=0;o<alloptions.size();o++)
		 {
			 String options = alloptions.get(o).getText();
			 
			 System.out.println(options);
			 
			 all1.add(options);// add options to array list to sort
		 }
		 System.out.println(alloptions.size());
		 System.out.println(selected.size());
		 Collections.sort(all1);
		 System.out.println(all1);
				 		
	}

}
