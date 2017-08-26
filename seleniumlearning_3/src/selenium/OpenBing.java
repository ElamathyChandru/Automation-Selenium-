package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBing {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
        driver.navigate().to("https://www.bing.com/");
        driver.manage().window().maximize();
     
        Robot robot = new Robot();
        
        driver.findElement(By.name("q")).sendKeys("smile please");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        driver.quit();
 
}
}