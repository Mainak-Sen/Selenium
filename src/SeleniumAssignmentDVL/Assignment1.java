package SeleniumAssignmentDVL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("ortonikc");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select s1= new Select(dropdown1);
		s1.selectByVisibleText("3");
		WebElement dropdown2=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s2= new Select(dropdown2);
		s2.selectByValue("London");
		WebElement dropdown3=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select s3= new Select(dropdown3);
		s3.selectByVisibleText("May");
		WebElement dropdown4=driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select s4= new Select(dropdown4);
		s4.selectByValue("30");
		WebElement dropdown5=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s5= new Select(dropdown5);
		s5.selectByValue("Acapulco");
		WebElement dropdown6=driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select s6= new Select(dropdown6);
		s6.selectByVisibleText("June");
		WebElement dropdown7=driver.findElement(By.xpath("//select[@name='toDay']"));
		Select s7= new Select(dropdown7);
		s7.selectByValue("5");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		WebElement dropdown8=driver.findElement(By.xpath("//select[@name='airline']"));
		Select s8= new Select(dropdown8);
		s8.selectByVisibleText("Unified Airlines");
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Mainak");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Sen");
		driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Sushmita");
		driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Sen");
		driver.findElement(By.xpath("//input[@name='passFirst2']")).sendKeys("Gautam");
		driver.findElement(By.xpath("//input[@name='passLast2']")).sendKeys("Sen");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("4011-2306-3709");
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
		driver.close();
		
		
	}

}
