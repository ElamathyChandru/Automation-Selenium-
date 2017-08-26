package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver get("https://www.google.co.in/?gfe_rd=cr&ei=j-eXWfyDB-Tx8Ae8mZewAw");
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("pass")).sendKeys("");
        driver.findElement(By.id("u_0_0"));
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
        driver.findElement(By.name("xhpc_message")).sendKeys(";-)");
       /* WebElement postButton=driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",postButton);
 */
        
        driver.findElement(By.xpath("//*[@id='u_0_15']/div[3]/div/div[2]/div/button")).click();      
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        driver.findElement(By.id("userNavigationLabel"));
  
}
}

