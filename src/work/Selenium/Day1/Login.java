package work.Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://optumrx--integrate.cs21.my.salesforce.com/?ec=302&startURL=%2F001q000000c3iUF\r\n" + 
				"");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("mbornfree93@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123@Salesforce");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.name("rememberUn")).click();

	}

}
