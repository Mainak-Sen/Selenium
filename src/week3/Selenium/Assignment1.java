package week3.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment1 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(element))
		WebElement dropdown1=driver.findElement(By.xpath("//div[@class='sort']/select"));
		Select s1=new Select(dropdown1);
		s1.selectByVisibleText("Highest to lowest");
		driver.findElement(By.xpath("//span[text()='XS']")).click();
		Thread.sleep(5000);
		List<WebElement> shirts1=driver.findElements(By.tagName("img"));
		Assert.assertEquals(shirts1.size(),1);
		//WebDriverWait w= new WebDriverWait(driver,30);
		//w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='S']"))));
		driver.findElement(By.xpath("//span[text()='S']")).click();
		Thread.sleep(10000);
		List<WebElement> shirts2=driver.findElements(By.xpath("//div[text()='Add to cart']"));
		Assert.assertEquals(shirts2.size(),2);
		System.out.println();
		/*driver.findElement(By.xpath("//span[text()='XS']")).click();
		driver.findElement(By.xpath("//span[text()='S']")).click();*/
		for(WebElement w:driver.findElements(By.xpath("//input[@type='checkbox']"))){
		if(w.isSelected())
		{
			System.out.println(w);
			w.click();
		}
	}
		Thread.sleep(10000);
		System.out.println("The number of shirts displayed at last is :"+driver.findElements(By.tagName("img")).size());
		driver.close();
		
		/*for(WebElement w:driver.findElements(By.xpath("//span[@class='checkmark']"))) {
			if(w.isSelected())
				{
					System.out.println("123");//w.click();
				}
		}*/
		/*WebElement parent = driver.findElement(By.xpath("//div[@class='filters-available-size']"));  

		List<WebElement> children = parent.findElements(By.cssSelector("input:checked[type='checkbox']"));  

		for(WebElement we : children)
		{
		we.click();
		}*/
		
	
		
		
	
		
		
		
		
		/*if(driver.findElement(By.xpath("//div[@class='filters-available-size']")).isSelected())
		{
			driver.findElement(By.xpath("//div[@class='filters-available-size']")).click();
		}*/
		
	}

}
