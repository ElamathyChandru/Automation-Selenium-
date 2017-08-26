package selenium;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingACP {
	public static void main(String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.javascriptkit.com/javatutors/alert2.shtml");


		driver.manage().window().maximize();

		
		// Alert Command
		WebElement alertButton =driver.findElement(By.name("B2"));
		alertButton.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);


		// Confirm Command
		WebElement c=driver.findElement(By.name("B3"));
		c.click();
		Alert c_alert=driver.switchTo().alert();
	    c_alert.accept();
	    c_alert.accept();
	    Thread.sleep(2000);

		// Prompt Command
		WebElement p =driver.findElement(By.name("B4"));
		p.click();
		Alert p_alert=driver.switchTo().alert();
		p_alert.sendKeys("COOL");
		p_alert.accept();
		System.out.println(p_alert.getText());
		Thread.sleep(2000);
		p_alert.accept();

	}

}	
