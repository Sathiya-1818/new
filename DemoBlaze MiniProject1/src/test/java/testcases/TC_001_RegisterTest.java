package testcases;

import base.ProjectSpecificationMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Homepage;

import java.io.IOException;

public class TC_001_RegisterTest extends ProjectSpecificationMethod {

    @Test
    public void registerTest() {

        Homepage obj = new Homepage(driver);
        obj.registerclick()
                .gender()
                .Firstname()
                .Lastname()
                .Email()
                .Password()
                .ConfirmPassword()
                .RegButton()
                .ValidateRegister();

    }

}
