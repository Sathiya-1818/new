package guvi.org.Page;

import guvi.org.Base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends ProjectSpecification {
    @FindBy(xpath = "//*[@id=\"signup\"]")
    WebElement register;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public RegisterPage SignUpClick(){
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        return null;
    }
    public LoginPage LoginClick(){
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        return null;
    }
    public HomePage ValidateLogin(){
        String ExpectedHeading = "Contact List";
        WebElement Heading = driver.findElement(By.xpath("/html/body/div[1]/header/h1"));

        VisibilityofElement(Heading);
        String ActualHeading = Heading.getText();
        System.out.println(ActualHeading);

        if(ExpectedHeading.equalsIgnoreCase(ActualHeading)){
            System.out.println("Registration is Successfull");
        }else{
            System.out.println("Registration is Unsuccessfull");
        }
        return this;
    }
    public ContactListPage computersTab()
    {
        driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]")).click();

        return new ContactListPage(driver);
    }
    public HomePage Logout()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
        return this;

    }

}
