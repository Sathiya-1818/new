package guvi.org.Tests;

import guvi.org.Base.ProjectSpecification;
import guvi.org.Page.HomePage;

public class TC_002_LoginTest extends ProjectSpecification {
    public static void main(String[] args) {

        HomePage obj = new HomePage(driver);
        obj.LaunchandLoad();
        obj.LoginClick()
                .emailId("sathiyapriya@gmail.com")
                .Password("Sathiya86")
                .LoginButton()
                .ValidateLogin();
    }
}
