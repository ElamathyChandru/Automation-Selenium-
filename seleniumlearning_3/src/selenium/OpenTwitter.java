package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTwitter {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=j-eXWfyDB-Tx8Ae8mZewAw");
        driver.navigate().to("https://www.twitter.com/");
        driver.findElement(By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]"));
     
        
        
        
        
        
        /*Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh();*/
	   
}
}