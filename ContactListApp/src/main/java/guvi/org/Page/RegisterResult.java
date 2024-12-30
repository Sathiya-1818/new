package guvi.org.Page;

import guvi.org.Base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterResult extends ProjectSpecification {
    public RegisterResult(WebDriver driver){
        this.driver = driver;
    }

    public RegisterPage ValidateRegister(){
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
        return this.ValidateRegister();
    }
}
