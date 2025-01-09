package pages;

import base.ProjectSpecification;
import org.openqa.selenium.By;

public class RegisterPage extends ProjectSpecification {
    public RegisterPage() {
        this.driver = driver;
    }

    public RegisterPage gender() {
        driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
        return this;
    }

    public RegisterPage Firstname() {
        driver.findElement(By.id("FirstName")).sendKeys("Sathiya");
        return this;
    }

    public RegisterPage Lastname() {
        driver.findElement(By.id("LastName")).sendKeys("Gopi");
        return this;
    }

    public RegisterPage Email() {
        driver.findElement(By.id("Email")).sendKeys("sathiyapriyav@gmail.com");
        return this;
    }

    public RegisterPage Password() {
        driver.findElement(By.id("Password")).sendKeys("Sathiya86");
        return this;
    }

    public RegisterPage ConfirmPassword() {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Sathiya86");
        return this;
    }
    public RegisterResult RegButton() {
        driver.findElement(By.id("register-button")).click();
        return new RegisterResult(driver);
    }
}
