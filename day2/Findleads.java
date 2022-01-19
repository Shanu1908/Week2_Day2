package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findleads {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on the phone
		driver.findElement(By.linkText("Phone")).click();
		//Enter the phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9025242755");
		//Click on the Find leads button
				driver.findElement(By.linkText("Find Leads")).click();
		//Capture First displayed ID
				Thread.sleep(3000);//Using Sleep to get the first lead
				String fLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
				System.out.println(fLead);
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fLead);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				String confirmation = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
				
				if(confirmation!=fLead)
				{
					System.out.println("Lead deleted successfully");
				}
				else {
					System.out.println("Lead not deleted");
				}
				driver.close();
			
			}
		
}

