package DemoforRadioandcheckbox;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        
        
        
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
        driver.manage().window().minimize();
        System.out.println(driver.findElement(By.cssSelector("input[id='checkbox2']")).isSelected());
        driver.findElement(By.cssSelector("input[id='checkbox2']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id='checkbox2']")).isSelected());
       
        //Count the number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        WebElement staticDropdown= driver.findElement(By.id("yearbox"));
        Select dropdown= new Select(staticDropdown);
        dropdown.selectByIndex(9);  
        System.out.println(dropdown.getFirstSelectedOption().getText()); 
        dropdown.selectByVisibleText("1986");
        WebElement staticDropdown1= driver.findElement(By.id("daybox"));
        Select dropdown1= new Select(staticDropdown1);
        dropdown1.selectByIndex(2);  
        System.out.println(dropdown1.getFirstSelectedOption().getText()); 
        
        
        
        WebElement staticDropdown3= driver.findElement(By.id("Skills"));
        Select dropdown3= new Select(staticDropdown3);
        dropdown.selectByIndex(9);  
        System.out.println(dropdown3.getFirstSelectedOption().getText()); 
        dropdown3.selectByVisibleText("HTML");
        System.out.println(dropdown3.getFirstSelectedOption().getText());
        dropdown3.selectByValue("APIs");
        System.out.println(dropdown3.getFirstSelectedOption().getText());
        WebElement staticDropdown4= driver.findElement(By.id("country"));
       Select dropdown4= new Select(staticDropdown4);
        dropdown4.selectByIndex(1);
        System.out.println(dropdown4.getFirstSelectedOption().getText());
        WebElement staticDropdown5 = driver.findElement(By.id("countries"));
        Select dropdown5=new Select(staticDropdown5);
        dropdown5.selectByIndex(0);
        driver.findElement(By.id("msdd")).getText();
        //dropdown.selectByVisibleText("1986");
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("muthu123");
        driver.findElement(By.cssSelector("input[id='secondpassword']")).sendKeys("muthu123");
        driver.findElement(By.id("submitbtn")).click();
	}
}
