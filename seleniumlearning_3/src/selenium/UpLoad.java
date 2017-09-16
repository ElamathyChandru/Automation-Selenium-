package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpLoad {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.filehosting.org/");
		driver.manage().window().maximize();
		WebElement chooseFile=driver.findElement(By.name("upload_file"));
		chooseFile.click();
		String fileLocation= "E:\\ak\\portfolio\\welcome.txt";
		StringSelection stringSelection =new StringSelection(fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.name("uploader_email")).sendKeys("elamathychandru@gmail.com");

		driver.findElement(By.name("accept_tos")).click();
		driver.findElement(By.name("submit")).click();
		
	}

	
}
