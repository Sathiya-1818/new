package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class InvalidLogin extends ProjectSpecification {

    public InvalidLogin(WebDriver driver){
        this.driver = driver;
    }
    public InvalidLogin mail(String mailId){
        driver.findElement(By.id("Email")).sendKeys(mailId);
        return this;
    }
    public InvalidLogin Password(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
        return this;
    }
    public HomePage LoginButton() {
        driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
        return new HomePage(driver);
    }
}
