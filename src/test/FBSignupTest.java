package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement Signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Signup.click();

		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		fName.sendKeys("John");

		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lName.sendKeys("WHITE");

		// reg_email__

		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("1234567891");
		// reg_passwd__
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Abc@1234");

		// WebElement SelectDay =
		// driver.findElement(By.xpath("//select[@tittle='Day']/option[@selected='1']"));

		WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("The default day is " + selectedDay.getText());

		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("10");
		// ddDay.selectByValue("10");

		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jan");

		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("2000");

		// List<webelement> list =
		// driver.findElements(By.xpath("//select[@tittle='Month']/option"))

		List<WebElement> list = driver.findElements(By.xpath("//select[@title='Month']/option"));
		for (WebElement month : list) {
			System.out.println(month.getText());

			WebElement Female = driver.findElement(By.xpath("//input [@type='radio' and @value='1']"));
			Female.click();

			String Gender = "Male";

			String genderXpath = "//label[text()='placeholder']";
			String newXpath = genderXpath.replace("placeholder", Gender);

			// String newXpath = "//label[text()='" + Gender + "']";

			WebElement genderElem = driver.findElement(By.xpath(newXpath));
			genderElem.click();

		}

	}
}
