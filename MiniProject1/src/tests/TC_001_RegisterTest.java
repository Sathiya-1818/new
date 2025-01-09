package tests;

import base.ProjectSpecification;
import pages.HomePage;

public class TC_001_RegisterTest extends ProjectSpecification {

    public static void main(String[] args){

        HomePage obj = new HomePage(driver);
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