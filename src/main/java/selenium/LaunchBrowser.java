package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandh\\Eclipse_Automation_New_2023\\MyNewSeleniumSession\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
