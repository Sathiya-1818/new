import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Specification {
    @FindBy(id = "signin2")
    WebElement SignUp;

    public HomePage(WebDriver driver) {
        UtilityClass.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public RegisterPage registerclick() {
        driver.findElement(By.id("signin2")).click();
        return new RegisterPage(driver);
    }

    public LoginPage loginClick() {
        driver.findElement((By.id("login2"))).click();
        return new LoginPage(driver);
    }

    public HomePage ValidateLogin() {
        WebElement name = driver.findElement(By.id("nameofuser"));
        VisibilityofElement(name);
        System.out.println(name);
        System.out.println("Registration is Successfull");
        return this;
    }

    public HomePage ContactInfo() {
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
        return new HomePage(driver);
    }

    public LoginPage LogOutClick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout2")));
        logoutButton.click();
        wait.until(ExpectedConditions.urlContains("Login"));
        return new LoginPage(driver);
    }

    public void ProductCheckList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cat"))));
    }

    public LoginPage AddToCart() {
        return new LoginPage(driver);
    }

    public LoginPage VerifyCart(){
        return new LoginPage(driver);
    }

    public LoginPage PurchasePage(){
        return new LoginPage(driver);
    }
}


