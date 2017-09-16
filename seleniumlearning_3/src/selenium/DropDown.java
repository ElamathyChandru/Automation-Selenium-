package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();

		WebElement dropdown=driver.findElement(By.name("dropdownmenu")); 
		Thread.sleep(3000);
		Select selectmilk=new Select(dropdown);
		selectmilk.selectByVisibleText("Milk");
		Select selectbutter=new Select(dropdown);
		Thread.sleep(1000);
		selectbutter.selectByVisibleText("Butter");
		Thread.sleep(1000);
		
		
		Select selectcheese=new Select(dropdown);
		selectcheese.selectByVisibleText("Cheese");


	}

}
