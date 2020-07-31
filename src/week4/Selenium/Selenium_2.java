package week4.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_2 {
	//script where we used isSeleceted,isDisplayed and isEnabled

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://play.letcode.in/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Assert.assertTrue(driver.findElement(By.id("name3")).isSelected());
		driver.navigate().back();
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#checkbox2")).isEnabled());
		driver.navigate().back();
		driver.findElement(By.xpath("//i[text()='laptop_windows']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).isDisplayed());
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		System.out.println(driver.getWindowHandles().size());
		Set<String> wh=driver.getWindowHandles();
		List<String> wh_list= new ArrayList<String>();
		wh_list.addAll(wh);
		driver.switchTo().window(wh_list.get(1)).close();
		driver.quit();
	}

  

}
