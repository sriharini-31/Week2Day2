package Week2Day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver page = new ChromeDriver();
		page.get("http://leafground.com/pages/Edit.html");

		page.findElement(By.id("email")).sendKeys("hari@gmail.com");

		String str = "sri";
		str = str.concat("harini");

		WebElement a1 = page.findElement(
				By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input"));
		a1.clear();
		a1.sendKeys(str);
		a1.sendKeys(Keys.TAB);
		
		//String a2=new String();
		
		
		
		 String attri = page.findElement(By.xpath("(//input[@name='username'])")).getAttribute("value");
	
		 System.out.println(attri);
		 
		 
		 
		 
	page.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		
	boolean enabled = page.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled();

		if(enabled){
			System.out.println("It is enabled");
			
		}
		else
			System.out.println("It is disabled");

	}

}
