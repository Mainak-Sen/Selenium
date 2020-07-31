package work.Selenium.Day1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc_site {
	
	//Handling window

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/profile/forgot-password?pageType=P");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-facebook-square']")).click();
		Set<String> window_handles=driver.getWindowHandles();
		List<String> wh=new ArrayList<String>();
		wh.addAll(window_handles);
		String parent_window=wh.get(0);
		driver.switchTo().window(wh.get(wh.size()-1));
		driver.close();
		driver.switchTo().window(parent_window);
		driver.close();
		

	}

}
