package selenium.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xpath.internal.operations.Div;

public class BookMovieTickets {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement location = driver.findElement(By.xpath("//h6[text()='Chennai']"));
		wait.until(ExpectedConditions.elementToBeClickable(location)).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Cinema']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Cinema']"))).click();

		WebElement cinema = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//li[contains(@class,'p-dropdown-item')]//span[contains(text(),'INOX The Marina Mall')]")));
		js.executeScript("arguments[0].scrollIntoView(true);", cinema);
		Thread.sleep(500);
		js.executeScript("arguments[0].click();", cinema);

		WebElement selectDate = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//li[contains(@class,'p-dropdown-item')]//span[contains(text(),'Tue')]")));
		js.executeScript("arguments[0].scrollIntoView(true);", selectDate);
		Thread.sleep(500);
		js.executeScript("arguments[0].click();", selectDate);

		WebElement movieName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'ETERNITY')]")));
		js.executeScript("arguments[0].scrollIntoView(true);", movieName);
//		Thread.sleep(500);
		js.executeScript("arguments[0].click();", movieName);

		WebElement timing = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//li[contains(@class,'p-dropdown-item')]//span[contains(text(),'04:25 PM')]")));

		js.executeScript("arguments[0].scrollIntoview(true);", timing);
//		Thread.sleep(50000);
		js.executeScript("arguments[0].click();", timing);
        Thread.sleep(5000);
		WebElement bookButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//button[contains(@class,'p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn')]//span[text()='Book']")));
		js.executeScript("arguments[0].scrollIntoView(true);",bookButton);
		Thread.sleep(500);
		js.executeScript("arguments[0].clicl();",bookButton);

	}

}
