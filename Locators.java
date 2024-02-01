package FirstDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
        driver.findElement(By.id("inputUsername")).sendKeys("Muthu");
        driver.findElement(By.name("inputPassword")).sendKeys("12345");
        driver.findElement(By.className("submit")).click();
        System.out.println (driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Adviikkanna");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("AD@GMAIL.COM");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8939149179");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        
        System.out.println (driver.findElement(By.cssSelector("form p")).getText());
	}

}
