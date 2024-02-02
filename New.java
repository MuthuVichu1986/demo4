package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.get("https://demo.automationtesting.in/Register.html");
      driver.manage().window().maximize();
      driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("MUTHU");
      driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("KUMAR");
      driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("123ghgh");
      driver.findElement(By.cssSelector("input[type='Email']")).sendKeys("Ad@gmail.com");
      driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("6789456123");
      driver.findElement(By.xpath("//input[@type='radio']")).click();
      driver.findElement(By.xpath("//input[@name='radiooptions']")).click();
      driver.findElement(By.id("checkbox1")).click();
      driver.findElement(By.id("checkbox2")).click();
      driver.findElement(By.id("checkbox3")).click();
      
      
      
	

}
}
