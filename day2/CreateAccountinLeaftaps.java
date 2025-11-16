package week2.day2;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountinLeaftaps {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();

		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();

		driver.findElement(By.id("accountName")).sendKeys("Prasanth Narasimman");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Engineer");

		WebElement industryType = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industryType);
		industry.selectByValue("IND_SOFTWARE");

		WebElement ownershipType = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ownershipType);
		ownership.selectByVisibleText("Partnership");

		WebElement dataSource = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(dataSource);
		source.selectByValue("LEAD_EMPLOYEE");

		WebElement marketingCampaignType = driver.findElement(By.id("marketingCampaignId"));
		Select campaign = new Select(marketingCampaignType);
		campaign.selectByIndex(5);

		WebElement province = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(province);
		state.selectByValue("TX");

		WebElement createButton = driver.findElement(By.className("smallSubmit"));
		createButton.click();

		WebElement accountName = driver.findElement(By.linkText("Prasanth Narasimman (10416)"));
		String verifyName = accountName.getText();
		System.out.println(verifyName + ":Account Name displayed correctly");

		driver.close();

	}

}
