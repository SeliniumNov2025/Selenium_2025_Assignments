package org.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandle {
	
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
	
		String window1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Open']/parent::button")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String window2 : allWindows) {
         
			driver.switchTo().window(window2);
			}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("thiruaero2020");
		driver.close();
		driver.switchTo().window(window1);
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']/parent::button")).click();
		int num = driver.getWindowHandles().size();
		System.out.println("Number od windows opened :" +num);
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowsAll = driver.getWindowHandles();
		for (String windowsss : windowsAll) {
			if(!windowsss.equals(window1)) {
				driver.switchTo().window(windowsss);
				driver.close();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
