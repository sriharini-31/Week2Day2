package Week2Day2Assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RedBus {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Madurai");
		driver.findElement(By.xpath("//li[@data-id='123']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Chennai ");
		driver.findElement(By.xpath("//ul[@class='autoFill']/li")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("//td[text()='15']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='close']/i")).click();
	    String numOfSeats = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Total number of Seats available in:" +numOfSeats);
	    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label")).click();
	     String numOfSleeperSeats = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Number of Sleeper seats available in:"+numOfSleeperSeats);
	    
	    WebElement element = driver.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label"));
	    element.click();
	    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//label[text()='AC']/preceding-sibling::label")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String numOfAcSeats = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Number of AC seats available in: "+numOfAcSeats);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//label[text()='NONAC']/preceding-sibling::label")).click();
	    String numOfNonAcSeats = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Number of AC & Non AC seats available in : "+numOfNonAcSeats);

	}

}
