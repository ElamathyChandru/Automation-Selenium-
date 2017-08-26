package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.id("masthead-search-term")).sendKeys("Selenium Automation");
		driver.findElement(By.id("search-btn")).click();

}
}    