package work.Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("\r\n" + 
				"https://play.letcode.in/frame" + 
				"");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.switchTo().alert().accept();
		



	}

}
