package work.Selenium.Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://play.letcode.in/table");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,30);
		driver.manage().window().maximize();
		List<WebElement> t_data=driver.findElements(By.xpath("//table[@name='table']/tbody/tr[2]/td"));
		
		for(WebElement we: t_data)
		{
			if(we.getText().equalsIgnoreCase("Mary"))
			{
				driver.findElement(By.xpath("//input[@id='qe']")).click();   
			}
		}
        driver.quit();
	}

}
