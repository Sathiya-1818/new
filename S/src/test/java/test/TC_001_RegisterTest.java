package test;

import base.ProjectSpecificationMethod;
import page.Homepage;

public class TC_001_RegisterTest extends ProjectSpecificationMethod {

    public static void main(String[] args){

        Homepage obj = new Homepage(driver);
        obj.launchandLoad();
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
