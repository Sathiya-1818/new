package page;

import base.ProjectSpecificationMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ProjectSpecificationMethod {

    @FindBy(id="Email")
    WebElement mailId;

    @FindBy(id="Password")
    WebElement passWord;

    @FindBy(xpath = "//input[contains(@class,'login-button')]")
    WebElement login;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
