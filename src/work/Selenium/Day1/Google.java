package work.Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	// to find the number of times cricket has occured in the landing page 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("cricket");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.findElements(By.xpath("//*[contains(text(),'cricket')]")).size());
		System.out.println(driver.findElements(By.xpath("//*[contains(text(),'Cricket')]")).size());
		driver.close();
		

	}

}