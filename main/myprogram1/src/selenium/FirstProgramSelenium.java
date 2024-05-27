package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstProgramSelenium
{

   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","Driver\\msedgedriver.exe");
       WebDriver driver = new EdgeDriver();// open the browser

       driver.manage().window().maximize();// maximize the windows
       driver.get("https://demoqa.com/buttons&quot");
       
       WebElement ele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
       Thread.sleep(100);
       Actions act=new Actions(driver);
       act.doubleClick(ele).perform();
       //Thread.sleep(2000);
       
       System.out.println("hi");
       

   }

}