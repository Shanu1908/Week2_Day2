package week2.day2;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Leaftapcreatecontact {

		public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Shankari");
			driver.findElement(By.id("lastNameField")).sendKeys("Lakshmi");
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Shankari");
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Lakshmi");
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createContactForm_description")).sendKeys("humanity");
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("butter@gmail.com");
			WebElement state =  driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select dd = new Select(state);
			dd.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Notes");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();

			

		}
}
