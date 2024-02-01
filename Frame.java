package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame(0);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.switchTo().frame(1);
		WebElement frameText = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text inside the frame:" + frameText.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement secondFrameText = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text inside the frame:" + secondFrameText.getText());
		driver.switchTo().defaultContent();
		driver.quit();
		
		

	}

}
