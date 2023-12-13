package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandh\\Eclipse_Automation_New_2023\\MyNewSeleniumSession\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\sandh\\Eclipse_Automation_New_2023\\Test.txt");
		
		driver.quit();
		
	}

}
