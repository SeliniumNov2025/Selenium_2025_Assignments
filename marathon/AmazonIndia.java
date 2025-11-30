package selenium.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonIndia {
	
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Guest");
		
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		String results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-header-text']")).getText();
		System.out.println("Total number of Results :"+results);
		driver.findElement(By.linkText("Skybags")).click();
		driver.findElement(By.linkText("Frantic")).click();
		driver.findElement(By.linkText("Sort by:")).click();
		
		
//		driver.findElement(By.xpath("((//input[@type='checkbox'])[1]")).click();
		
	}

}
