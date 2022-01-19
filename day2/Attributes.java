package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup the driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser

		ChromeDriver driver = new ChromeDriver();
		
		//maximize the url
	   driver.manage().window().maximize();
	   
	   //load the url
		driver.get("http://leaftaps.com/opentaps/control/login");

		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Enter the UserName
		
		WebElement userName = driver.findElement(By.xpath("//input[@class='inputLogin' and @id='username']"));
		
		userName.sendKeys("DemoSalesManager");
		
        WebElement password = driver.findElement(By.xpath("//input[@class='inputLogin' and @id='password']"));
		
		password.sendKeys("crmsfa");
		//Enter the password
		
		//Click on Login button 
		driver.findElement (By.xpath("//input[contains(@class,'decorativeSubmit')])[1]")).click();
		
		//Click on CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on Leads tab
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		
		//EnterCompany Name
		driver.findElement(By.xpath("//input[@id=createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Enter First Name
		driver.findElement(By.xpath("//input[@class= 'inputBox' and @name = 'firstName']")).sendKeys("Shankari");
		
		// Enter Last Name
		driver.findElement(By.xpath("//inout[contains(@class, 'input') and @name = 'LastName']")).sendKeys("LakshmiNarayanan");
		
		
		//Locate the element with select tag
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Create object for Select class
		Select dropdown = new Select (Source);
		
        dropdown.selectByIndex(3)	;
        
		//Click on Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		//Click on logout
		driver.findElement(By.linkText("Logout")).click();
	
	}
}
