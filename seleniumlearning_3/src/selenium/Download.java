package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=KDqqWbuWLPPx8Af965-IAw");
		driver.manage().window().maximize();


		driver.findElement(By.name("q")).sendKeys("Let it go Frozen");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id='uid_0']/div[1]/div[2]/div[1]/div/div/div/div/div[2]/h3/a")).click();
	driver.findElement(By.xpath("//*[@id='movie_player']/div[26]/div[2]/div[1]/button")).click();
	}
	}
