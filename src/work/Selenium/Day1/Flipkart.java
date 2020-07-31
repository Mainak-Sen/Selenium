package work.Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,30);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).perform();
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Mi']"))));
		driver.findElement(By.xpath("//a[@title='Mi']")).click();
		w.until(ExpectedConditions.titleContains("Mi Mobile Phones"));
		System.out.println(driver.getTitle());

	}

}
