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

public class Converter {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=j-eXWfyDB-Tx8Ae8mZewAw");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("word to pdf converter");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='rso']/div/div/div[2]/div/div/h3/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div/div/div[4]/div/div/label/div[2]/div[1]/div/div[1]/p[1]/span/span")).click();

		String fileLocation= "C:\\Users\\Admin\\Documents\\word.docx";
		StringSelection stringSelection =new StringSelection(fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Thread.sleep(2000);


		Robot robot1 = new Robot();
		robot1.delay(1000);
		robot1.keyPress(KeyEvent.VK_CONTROL);

		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);
		driver.findElement(By.className("db-active-area")).click();
		//Thread.sleep(5000);

		//driver.close();
	}
}
