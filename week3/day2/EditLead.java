package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prasanth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Narasimman");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Sparrow");

		driver.findElement(By.name("departmentName")).sendKeys("SoftwareTestEngineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("All Is Well");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thiruppathinarasimman35@gmail.com");

		WebElement statelist = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select province = new Select(statelist);
		province.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Always Be Happy");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		System.out.println("Title of Resulting Page is " + title);
		driver.close();

	}

}
