package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandler {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandh\\Eclipse_Automation_New_2023\\MyNewSeleniumSession\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);
		
		if(message.equals("Please enter a valid user name")) {
			System.out.println("Correct Message");
		}
		else {
			System.out.println("In Correct Message");
		}
		
		alert.accept(); //click on ok button
		
		//alert.dismiss(); //click on cancel button 
		
		driver.quit();
		
	}

}
