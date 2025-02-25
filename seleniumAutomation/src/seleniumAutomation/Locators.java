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


		//Finding Username textbox using ID
		WebElement userNameBox = driver.findElement(By.id("Username_Aeries"));
		userNameBox.sendKeys("admin");

		//Finding Password textbox using ID
		WebElement passwordBox = driver.findElement(By.id("Password_Aeries"));
		passwordBox.sendKeys("admin");

		//Finding Sign In button using Name
		WebElement clickBtn = driver.findElement(By.name("btnSignIn_Aeries"));
		clickBtn.click();

		Thread.sleep(5000);

		//Finding Continue button using Name
		driver.findElement(By.name("btnContinueIn_Aeries")).;

		//Verifying presence of hyperlink
		driver.findElement(By.linkText("https://demo.aeries.net/AeriesTX")).click();


		driver.quit();
	}

}
