package Week2Day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
//Click button to travel home page
		driver.findElement(By.xpath("//button[contains(text(),'Go to Home Page')]")).click();
//Find position of button (x,y)
		driver.navigate().back();
		WebElement position = driver.findElement(By.xpath("//button[@id='position']"));
		Point location = (Point) position.getLocation();
		int x = ((org.openqa.selenium.Point) location).getX();
		int y = ((org.openqa.selenium.Point) location).getY();
		System.out.println("Find position of button (x,y) : " + x + " and " + y);

		// Find button color
		String colr = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(colr);
//		 Find the height and width
		WebElement hgtwid = driver.findElement(By.xpath("//button[@id='position']"));
		org.openqa.selenium.Dimension dimension = hgtwid.getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("Find position of button (height,width) : " + height + " and " + width);
		

	}

}
