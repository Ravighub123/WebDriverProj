package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement Uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Uname.sendKeys("standard_user");
		
		WebElement Pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Pwd.sendKeys("secret_sauce");
		
		WebElement Login = driver.findElement(By.xpath(" //input[@type='submit']"));
        Login.click();

	}

}
