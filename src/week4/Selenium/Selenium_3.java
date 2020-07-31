package week4.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://jqueryui.com/selectable/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//WebDriverWait w_wait=new WebDriverWait(driver,30);
		js.executeScript("window.scrollBy(0,1000)");//handled the scroll feature with javascriptexecutor
		driver.switchTo().frame(0);
		Actions builder=new Actions(driver);
		WebElement w_ele1=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement w_ele2=driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement w_ele3=driver.findElement(By.xpath("//li[text()='Item 5']"));
		builder.keyDown(Keys.CONTROL).click(w_ele1).click(w_ele2).click(w_ele3).perform();
		driver.quit();
		
	}

}
