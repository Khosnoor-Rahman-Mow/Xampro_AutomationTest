package xampropack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfileUpdate {

	public static void main(String[] args) {
		
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver prodriver = new FirefoxDriver();

		prodriver.get("https://www.xampro.org/login");
		prodriver.manage().window().maximize();
		
		
		//login	
		prodriver.findElement(By.id("email")).sendKeys("khosnoorrahmanmow026@gmail.com");
		prodriver.findElement(By.id("password")).sendKeys("xammow26");
		prodriver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//find dropdown 
		
		//prodriver.findElement(By.id("basic-nav-dropdown")).click();
		WebElement Tdropdown = prodriver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div[4]/div/div/ul/li[8]/a"));
		Select dropdown = new Select(Tdropdown)	;
		dropdown.selectByIndex(6);
		
		
		prodriver.findElement(By.id("fullname")).sendKeys("Khosnoor Rahman Mow");
		prodriver.findElement(By.id("email")).sendKeys("khosnoorrahmanmow026@gmail.com");
		prodriver.findElement(By.id("phoneNumber")).sendKeys("01782447664");
		
		WebElement radiobutton = prodriver.findElement(By.id("Male"));
		radiobutton.click();		
		
		WebElement radiobutton2 = prodriver.findElement(By.id("Female"));
		radiobutton2.click();
		
		WebElement Testdropdown = prodriver.findElement(By.name("education"));
		Select dropdown1 = new Select(Testdropdown);
		
		
		
		
		}



	

}
