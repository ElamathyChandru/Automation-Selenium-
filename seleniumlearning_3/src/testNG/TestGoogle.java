package testNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGoogle {
    //@Test(enabled=false)
	//@Test(priority=1)
	@Test(priority=2)
	public void TestGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=j-eXWfyDB-Tx8Ae8mZewAw");
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void Bing(){
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.bing.com/");
		driver.manage().window().maximize();
	}
	}

