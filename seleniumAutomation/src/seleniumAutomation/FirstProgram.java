package seleniumAutomation;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {

		//Invoking Browsers
		System.setProperty("webdriver.chrome.driver", "resources\\drivers\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "resources\\drivers\\edgedriver\\msedgedriver.exe");
		System.setProperty("webdriver.firefox.driver", "resources\\drivers\\firefoxdriver\\geckodriver.exe");

		//Initializing driver objects
		HashMap<String, WebDriver> driversList = new HashMap<>();
		driversList.put("chrome", new ChromeDriver());
		driversList.put("edge", new EdgeDriver());
		driversList.put("firefox", new FirefoxDriver());

		//Using different browsers
		for(String browser : driversList.keySet()) {
			WebDriver driver = driversList.get(browser);
			System.out.println("Browser: " + browser);

			//Navigating to URL
			String url = "https://demo.aeries.net/aeries/Login.aspx?demo=True&user=admin&pwd=admin";
			driver.get(url);

			//Get the title of page
			System.out.println(driver.getTitle());

			//Get current url of page
			String pageUrl = driver.getCurrentUrl();
			System.out.println(pageUrl);
			if(url.equals(pageUrl)) System.out.println("URL matching successfully!");

			//Quitting the driver
			driver.quit();
		}
	}

}
