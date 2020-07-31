package work.Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://jqueryui.com/sortable/\r\n" + 
				"");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		Actions builder= new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement dst=driver.findElement(By.xpath("//li[text()='Item 4']"));
		int x=dst.getLocation().x;
		int y=dst.getLocation().y;
		builder.dragAndDropBy(src, x, y).perform();
		

	}

}
