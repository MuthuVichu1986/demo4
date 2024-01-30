package sampledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("muthu");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("sdffe");
		driver.findElement(By.id("permanentAddress")).sendKeys("eeeu");
		WebElement submit = driver.findElement(By.id("submit"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",submit);
		submit.click();

	}

}
