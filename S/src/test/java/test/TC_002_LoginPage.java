package test;

import base.ProjectSpecificationMethod;
import page.Homepage;

public class TC_002_LoginPage extends ProjectSpecificationMethod {
    public static void main(String[] args){
        Homepage obj = new Homepage(driver);
        obj.launchandLoad();
        obj.loginClick()
                .mail("meh472@gmail.com")
                .Password("Sathiya86")
                .LoginButton()
                .ValidateLogin();
    }
}
