package work.Selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFDriver {
	//Program to invoke Firefox browser

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//driver.get("http://www.google.com");

	}

}
