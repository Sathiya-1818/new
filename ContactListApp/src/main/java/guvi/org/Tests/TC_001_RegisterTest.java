package guvi.org.Tests;

import guvi.org.Base.ProjectSpecification;
import guvi.org.Page.HomePage;

public class TC_001_RegisterTest extends ProjectSpecification {
    public static void main(String[] args){

        HomePage obj = new HomePage(driver);
        obj.LaunchandLoad();
        obj.SignUpClick()
                .FirstName()
                .LastName()
                .emailId()
                .Password()
                .RegButton()
                .ValidateRegister();
    }
}
