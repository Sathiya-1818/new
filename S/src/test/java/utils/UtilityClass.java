package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UtilityClass {
   public static WebDriver driver;
   public void browserlaunch(){

       driver = new ChromeDriver();
       driver.get("https://demowebshop.tricentis.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

   }
   public void closeBrowser(){
      driver.close();

   }
   public void VisibilityofElement(WebElement element){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.visibilityOf(element));
   }


}
