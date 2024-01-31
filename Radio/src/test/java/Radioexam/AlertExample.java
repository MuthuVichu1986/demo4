package Radioexam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
	    driver.findElement(By.id("alertButton")).click();
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();

		//driver.findElement(By.xpath("//[id=\"OKTab\"]/button")).click();
	    //Alert alert= driver.switchTo().alert();
	    //System.out.println("Alert Test:" + alert.getText());
	    //alert.accept();
	   // alert.dismiss();
	   // driver.findElement(By.linkText("Alert with Textbox")).click();
	    //driver.findElement(By.cssSelector("button[class-'btn btn-info']")).click();
	    //Alert alerttextbox=driver.switchTo().alert();
	    //System.out.println(alerttextbox.getText());
	    //alerttextbox.sendKeys("you are doing ok");
		

	}

}
