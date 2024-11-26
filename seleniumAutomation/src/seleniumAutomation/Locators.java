package seleniumAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "resources\\drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.aeries.net/aeries/Login.aspx";
		driver.get(url);
		
		//Finding Username textbox
		WebElement userNameBox = driver.findElement(By.id("Username_Aeries"));
		userNameBox.sendKeys("admin");
		
		WebElement passwordBox = driver.findElement(By.id("Password_Aeries"));
		passwordBox.sendKeys("admin");
		
		WebElement clickBtn = driver.findElement(By.name("btnSignIn_Aeries"));
		clickBtn.click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("btnContinueIn_Aeries"));
		//btnContinueIn_Aeries
		
		driver.quit();
	}

}
