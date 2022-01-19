package week2.day2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DupliacteLead  {

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
					Thread.sleep(3000);
					String fElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
					System.out.println("First Lead is: "+fElement);
					driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
					driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
					
					String capturedTitle = driver.getTitle();
					System.out.println("Duplicate Lead Title : "+capturedTitle);
					
					driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
					Thread.sleep(1000);
					

					String verifyTitle = driver.getTitle();
					System.out.println("View Lead Title: "+verifyTitle);
				
					String fElement1= driver.findElement(By.id("viewLead_firstName_sp")).getText();
				
					if( fElement1.contains(fElement))
						   System.out.println("Duplicate is created ");
					   else
						   System.out.println("Duplicate is not created");
					driver.close();

			
	}


}
