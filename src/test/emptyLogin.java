package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class emptyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("abc@xyz.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Abcd@1234");

		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
