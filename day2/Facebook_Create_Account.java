package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Create_Account {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
		createAccountButton.click();

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Thiruppathi");

		driver.findElement(By.name("lastname")).sendKeys("Narassimman");

		WebElement day = driver.findElement(By.id("day"));
		Select listOfDays = new Select(day);
		listOfDays.selectByIndex(13);

		WebElement month = driver.findElement(By.id("month"));
		Select listOfMonths = new Select(month);
		listOfMonths.selectByValue("5");

		WebElement year = driver.findElement(By.id("year"));
		Select listOfYears = new Select(year);
		listOfYears.selectByVisibleText("1998");

		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();

		driver.findElement(By.name("reg_email__")).sendKeys("thiruppathinarasimman35@gmail.com");

	}

}
