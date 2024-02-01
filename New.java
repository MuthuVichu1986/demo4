package learn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver= new ChromeDriver();
       driver.get("https://demoqa.com/browser-windows");
       //String mainWindow= driver.getWindowHandle();
       WebElement newWindowButton= driver.findElement(By.id("windowsButton"));
       newWindowButton.click();
       Set<String> windowHandles = driver.getWindowHandles();
       for (String windowHandle :windowHandles) {
    	   driver.switchTo().window(windowHandle);
       }
       WebElement newWindowText= driver.findElement(By.id("sampleHandling"));
       System.out.println("Text in the window:" + newWindowText.getText());
       driver.close();
       driver.switchTo().window(windowHandles.iterator().next());
       WebElement newTabButton = driver.findElement(By.id("tabButton"));
       newTabButton.click();
       windowHandles = driver.getWindowHandles();
       for (String windowHandle :windowHandles) {
    	   driver.switchTo().window(windowHandle);
    	   
       }
       WebElement newTabText = driver.findElement(By.id("sampleHeading"));
       System.out.println("Text in the new Tab" + newTabText.getText());
       driver.quit();
       
       
       
	}

}
