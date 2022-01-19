package week2.day2;

	
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Editlead {

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
					driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
					driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("N");
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
					System.out.println(driver.getTitle());
					driver.findElement(By.xpath("//a[text()='Edit']")).click();
					WebElement company = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
					company.clear();
					company.sendKeys("Test");
					driver.findElement(By.xpath("//input[@value='Update']")).click();
					String changedName=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
					System.out.println(changedName);
					driver.close();
				}

			}
