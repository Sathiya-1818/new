package guvi.org.Page;

import guvi.org.Base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ProjectSpecification {

    public LoginPage(WebDriver driver){
       this.driver = driver;
    }
    public LoginPage emailId(String mailId){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mailId);
        return this;
    }
    public LoginPage Password(String password){
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        return this;
    }
    public HomePage LoginButton(){
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        return new HomePage(driver);
    }
}
