package LoginWithparameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginWithBothIncorrect {

	
	@Test
	@Parameters({"username","password"})
	public void LoginbothCorrect(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\FaceBook\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId= driver.findElement(By.id("email"));
		emailId.sendKeys(username);
		
		WebElement pswd= driver.findElement(By.id("pass"));
		pswd.sendKeys(password);
		
		driver.quit();
	}
}
