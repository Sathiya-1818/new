package testcases;

import base.ProjectSpecificationMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Homepage;

import java.io.IOException;

import static com.microsoft.schemas.vml.CTFormulas.type;

public class TC_003_InvalidLoginTest extends ProjectSpecificationMethod {

    @Test
    public void invalidLogin(){

        Homepage obj = new Homepage(driver);
        String messsage = new String();
        obj.loginClick()
                .mail("764@gmail.com")
                .Password("data")
                .LoginButton()
                .validateLogin(String.valueOf(type),messsage);
    }
}
