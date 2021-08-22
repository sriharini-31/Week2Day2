package Week2Day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
//		Click on this image to go home page
		driver.get("http://leafground.com/pages/radio.html");
		
//		Are you enjoying the classes?
		
		driver.findElement(By.xpath("//section[@class='innerblock']//div[@id='first']//label[1]")).click();
		
	//  Find default selected radio button	
		driver.findElement(By.xpath("//section[@class='innerblock']//div[2]//label[3]"));
		
		//Select your age group (Only if choice wasn't selected)
		driver.findElement(By.xpath("//section[@class='innerblock']//div[3]//input")).click();


	}

}
