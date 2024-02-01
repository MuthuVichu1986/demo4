package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://demoqa.com/auto-complete");
	       WebElement autoCompleteInput = driver.findElement(By.id("autoCompleteMultipleInput"));
	       autoCompleteInput.sendKeys("MUTHU");
	       autoCompleteInput.sendKeys(Keys.ARROW_DOWN);
	       WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	       WebElement  autoOptions= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("auto-Complete(autoOptions)")));
	       autoOptions.click();
	       System.out.println(autoCompleteInput.getAttribute("value"));
	       driver.quit();
	       
	       
	}

}
