package mavennine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");

	   Actions ac = new Actions(driver);

		WebElement live= driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='Live']"));
		ac.moveToElement(live).build().perform();

		Thread.sleep(3000);

		WebElement automate= driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']"));
		automate.click();

		Thread.sleep(2000);

		driver.navigate().back();

		
		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		ac.doubleClick(trialaction).perform();
		
		driver.quit();

		
	}

}
