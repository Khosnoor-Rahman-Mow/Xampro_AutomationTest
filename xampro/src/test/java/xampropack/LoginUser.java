package xampropack;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginUser {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.xampro.org/login");
		driver.manage().window().maximize();
			
		driver.findElement(By.id("email")).sendKeys("khosnoorrahmanmow026@gmail.com");
		driver.findElement(By.id("password")).sendKeys("xammow26");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		}

}
