package technicalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit,SECONDS);
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.cssSelector("#username")).sendKeys("user123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("*123*Test");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='flash']")).getText().equals("You logged into a secure area!");
		driver.findElement(By.cssSelector(".button.secondary.radius")).click();
		driver.findElement(By.xpath("//div[@id='flash']")).getText().contentEquals("You logged out of the secure area!");
		

	}

}
