package page;

import base.ProjectSpecificationMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ProjectSpecificationMethod {

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage mail(String mailId){
        driver.findElement(By.id("Email")).sendKeys(mailId);
        return this;
    }
    public LoginPage Password(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
        return this;
    }
    public Homepage LoginButton() {
        driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
        return new Homepage(driver);
    }
}
