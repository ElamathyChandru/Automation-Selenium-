package selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.nio.channels.NetworkChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=j-eXWfyDB-Tx8Ae8mZewAw");
        driver.navigate().to("https://docs.google.com/forms/d/e/1FAIpQLSewZMCgWIOv5rNsyZBfV-PEDPQCiBgXcHcF4kJ0Pk_2uqvIDQ/viewform");
        //Thread.sleep(3000);
	    //driver.navigate().back();
	    /*Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    
	
	*/
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.name("q")).sendKeys("smile please");
        
 
       
	
	
	
	}
}
