package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTwitter {
	public static void main(String[]args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.name("identifier")).sendKeys("");
		Robot robot1 = new Robot();
	    robot1.keyPress(KeyEvent.VK_ENTER);
	    robot1.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(3000);
		
	    driver.findElement(By.name("password")).sendKeys("");
		Robot robot11 = new Robot();
		robot11.keyPress(KeyEvent.VK_ENTER);
	    robot11.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
		
	}
	
	
	

}
