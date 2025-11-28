package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
	public static void main(String[] args) {

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
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8122132930");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String leadID = driver.findElement(By.xpath("//a[text()='10544']")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("//a[text()='10544']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String verify = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println("The presence of message is " + verify);
		driver.close();

	}

}
