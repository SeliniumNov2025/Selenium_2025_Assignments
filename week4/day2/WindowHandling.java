package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> allWindows = new ArrayList<String>(windowHandles);
		String windows1 = allWindows.get(0);
		String windows2 = allWindows.get(1);
		
		
		driver.switchTo().window(windows2);
		String title = driver.getTitle();
		System.out.println("Title of new Window is :"+title);
		
		driver.switchTo().window(windows1);
		driver.close();
		
	}

}
