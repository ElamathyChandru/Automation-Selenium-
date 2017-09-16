package selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		//Link
		driver.navigate().to("http://employment.delhigovt.nic.in/dee/f_registration.asp");
		//Maximize
		driver.manage().window().maximize();
		//Infor
		driver.findElement(By.name("c_fname")).sendKeys("");
		driver.findElement(By.name("c_mname")).sendKeys("");
		driver.findElement(By.name("c_fhname")).sendKeys("");
		driver.findElement(By.name("c_mhname")).sendKeys("");

		//DOB
		WebElement searchBox=driver.findElement(By.xpath("//*[@id='cand']/form/table/tbody/tr[1]/td/fieldset/table/tbody/tr[3]/td[2]/a"));
		searchBox.click();

		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		for(String windowHandle  : handles)
		{
			if(!windowHandle.equals(parentWindow))
			{
				driver.switchTo().window(windowHandle);

				//Month
				WebElement dropdown=driver.findElement(By.name("MonthSelector"));
				dropdown.click();
				Select selectmon=new Select(dropdown);
				selectmon.selectByVisibleText("");

				//Year
				WebElement dd=driver.findElement(By.name("YearSelector"));
				dd.click();
				Select selectyear=new Select(dd);
				selectyear.selectByVisibleText("");

				//Date
				WebElement date=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td[7]/font/a"));
				date.click();
				driver.switchTo().window(parentWindow);
				//Gen
				driver.findElement(By.name("c_gen")).sendKeys("");
				driver.findElement(By.name("prov")).sendKeys("");
				driver.findElement(By.name("mstat")).sendKeys("");
				driver.findElement(By.name("relig")).sendKeys("");
				driver.findElement(By.name("categ")).sendKeys("");
				driver.findElement(By.name("ccerti_no")).sendKeys("");
				driver.findElement(By.name("ccerti_auth")).sendKeys("");
				driver.findElement(By.name("handi")).sendKeys("");
				driver.findElement(By.name("exserv")).sendKeys("");
				driver.findElement(By.name("priority")).sendKeys("");
				driver.findElement(By.name("eyesgt")).sendKeys("");
				driver.findElement(By.name("hgt")).sendKeys("");
				driver.findElement(By.name("corr_add1")).sendKeys("");
				driver.findElement(By.name("corr_city")).sendKeys("");
				driver.findElement(By.name("corr_pin")).sendKeys("");
				driver.findElement(By.name("corr_mobno")).sendKeys("");
				driver.findElement(By.name("corr_email")).sendKeys("");
			}

		}
	}
}
