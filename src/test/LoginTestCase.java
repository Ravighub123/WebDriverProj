package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 driver.get("https://www.simplilearn.com/");
		
		//Maximize browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//clickon login
		WebElement loginlink =driver.findElement(By.linkText("Log in"));
		String location = loginlink.getAttribute("href");
		System.out.println("The link will take you to " + location);
		loginlink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("abcdA123");

		//rememberme
		WebElement Rememberme = driver.findElement(By.className("rememberMe"));
		Rememberme.click();
		
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();

		WebElement error = driver.findElement(By.className("error_msg"));
		String Errormsg= error.getText();
		System.out.println("error msgis "+Errormsg);
		
		String expErrormsg ="The email or password you have entered is invalid.";
     if(error.isDisplayed() && Errormsg.equals(expErrormsg)) 
     
     {
			
			System.out.println("TC Passed");
		}else {
			
			System.out.println("TC Failed");
		}
     
     List<WebElement> allLinks = driver.findElements(By.tagName("a"));
     System.out.println("The toal no of links are :"+ allLinks.size());
     
     for (WebElement link : allLinks)
     {
    	 System.out.println(link.getAttribute("href"));
     }
     
     driver.close();
		
	}

}
