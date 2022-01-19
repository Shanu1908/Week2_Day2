package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Setup the driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser

		ChromeDriver driver = new ChromeDriver();
		
		//maximize the url
	   driver.manage().window().maximize();
	   
	   //load the url
		driver.get("https://en-gb.facebook.com/");

		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Click on Create New Account
		driver.findElement (By.xpath("//a[text() = 'Create New Account']")).click();
		
		//Enter the FirstName
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shankari");
		
		//Enter the SurName
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lakshmi");
		
		//Enter Mobile nUmber
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8056037987");
		
		//Enter New Password

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Shan@987");
		
		//Enter the Data of Birth
		

		WebElement day = driver.findElement(By.name("birthday_day"));
		//Create object for Select class
		Select dropdown = new Select (day);
		dropdown.selectByIndex(3)	;

		WebElement month = driver.findElement(By.name("birthday_month"));
		//Create object for Select class
		Select dropdown1 = new Select (month);

		dropdown1.selectByIndex(3)	;
		
		WebElement year = driver.findElement(By.name("birthday_month"));
		//Create object for Select class
		Select dropdown2 = new Select (year);
		dropdown2.selectByIndex(3)	;
		

		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(3000);
		
		driver.close();
	
		
		
}
}
