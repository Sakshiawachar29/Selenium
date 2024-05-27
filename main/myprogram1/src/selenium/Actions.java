package selenium;

import org.openqa.selenium.ChromeDriver;

public class Actions 
{
	      public static void main(String[] args) throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
	      ChromeDriver driver= new ChromeDriver();
	      driver.get("https://demoqa.com/buttons");
	      // WebElement ele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

	    
	      }
}


