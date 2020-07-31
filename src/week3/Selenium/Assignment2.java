package week3.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("oneplus"));
		driver.findElement(By.xpath("//img[@data-image-index='0']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Actions a=new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).click();
		if(driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value").contains("oneplus"))
		{
			System.out.println("textbox contains oneplus");
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		
		WebElement dropdown=driver.findElement(By.id("s-result-sort-select"));
		Select s= new Select(dropdown);
		s.selectByVisibleText("Price: High to Low");
		driver.close();
		

	
	}
}
