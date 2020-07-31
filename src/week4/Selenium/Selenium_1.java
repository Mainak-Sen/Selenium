package week4.Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Selenium_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wwait=new WebDriverWait(driver,30);
		Actions builder=new Actions(driver);
		WebElement stn_from=driver.findElement(By.id("txtStationFrom"));
		WebElement stn_to=driver.findElement(By.id("txtStationTo"));
		builder.moveToElement(stn_from).click().sendKeys("MAS",Keys.TAB).perform();
		builder.moveToElement(stn_to).click().sendKeys("Kolkata",Keys.TAB).perform();
		driver.findElement(By.cssSelector("input:checked[id='chkSelectDateOnly']")).click();
		List<WebElement> we= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[1]/a"));
		ArrayList<Integer> train_nos=new ArrayList<Integer>();
		//Extracting all the train numbers from the web-table  and storing it in train_nos list(unsorted list of train numbers)
		int count=0;
		for(WebElement w:we)
		{   
			while(count<4) {
			try {
			wwait.until(ExpectedConditions.visibilityOfAllElements(we));
			train_nos.add(Integer.parseInt(w.getText()));
			break;
			}
			catch(StaleElementReferenceException e)
			{
				count++;
				continue;
			}
			}
			//wwait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElements(we));
			//train_nos.add(Integer.parseInt(w.getText()));
		}
		Collections.sort(train_nos);//sorting the extracted list
        //System.out.println(train_nos);
		//Clicking on the link to sort the train
		driver.findElement(By.linkText("Train")).click();
		ArrayList<Integer> train_nos_sorted=new ArrayList<Integer>();
		//getting the list of web_elements list of train numbers after sorting 
		List<WebElement> we_postsort= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[1][@class='Sorted']/a"));
		for(WebElement w_ps:we_postsort)
		{
			train_nos_sorted.add(Integer.parseInt(w_ps.getText()));
		}
		//System.out.println(train_nos_sorted);
        Assert.assertTrue(train_nos.equals(train_nos_sorted));//Putting testng assertion to check whether sort functionality is working 
        System.out.println("Sorting functionality is working absolutely fine");
        driver.close();
	}

}
