package guvi.org.Page;

import guvi.org.Base.ProjectSpecification;
import org.openqa.selenium.By;

public class RegisterPage extends ProjectSpecification {
    public RegisterPage(){
        this.driver = driver;
    }
    public RegisterPage FirstName(){
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sathiya");
        return this;
    }
    public RegisterPage LastName(){
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("G");
        return this;
    }
    public RegisterPage emailId(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sathiyapriya@gmail.com");
        return this;
    }
    public RegisterPage Password(){
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sathiya86");
        return this;
    }
    public RegisterResult RegButton(){
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        return new RegisterResult(driver);
    }
}
