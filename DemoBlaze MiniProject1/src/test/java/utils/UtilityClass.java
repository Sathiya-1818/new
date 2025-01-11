package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class UtilityClass {
   public static WebDriver driver;

    public static ExtentReports extent;
    public static ExtentTest test;
    public String testName, testDescription, testCategory, testAuthor;

    public void browserLaunch(String browserName, String url) {
        if(browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("headless-Chrome")){
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--headless");
            driver = new ChromeDriver(option);
        }
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
    public void sendKeysMethod(WebElement ele, String input) {

        ele.sendKeys(input);
    }

    public static String screenshot(String name) throws IOException {

        String path="E:\\DemoBlaze MiniProject1\\test-output\\old"+name+".png";
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(path);
        FileUtils.copyFile(src, dest);
        return path;

    }


}
