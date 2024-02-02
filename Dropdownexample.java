package Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver= new ChromeDriver();
          driver.get("https://demo.automationtesting.in/Register.html");
          WebElement staticDropdown= driver.findElement(By.id("Skills"));
          Select dropdown= new Select(staticDropdown);
          dropdown.selectByIndex(9);  
          System.out.println(dropdown.getFirstSelectedOption().getText()); 
          dropdown.selectByVisibleText("HTML");
          System.out.println(dropdown.getFirstSelectedOption().getText());
          dropdown.selectByValue("APIs");
          System.out.println(dropdown.getFirstSelectedOption().getText());
          WebElement staticDropdown1= driver.findElement(By.id("country"));
         Select dropdown1= new Select(staticDropdown1);
          dropdown1.selectByIndex(1);
          System.out.println(dropdown1.getFirstSelectedOption().getText());
          WebElement staticDropdown2 = driver.findElement(By.id("countries"));
          Select dropdown2=new Select(staticDropdown2);
          dropdown2.selectByIndex(0);
          driver.findElement(By.id("msdd")).getText();
          
          
          
          
          
	}
}



