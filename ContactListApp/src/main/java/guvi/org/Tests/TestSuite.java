package guvi.org.Tests;

import guvi.org.Base.ProjectSpecification;
import guvi.org.Page.HomePage;
import org.apache.log4j.Priority;
import org.testng.TestRunner;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.priority;

public class TestSuite extends ProjectSpecification {

    @Test(priority = 1)
    public static void SignUp(){

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

    @Test(priority = 4)
    public static void Login(){

        HomePage obj = new HomePage(driver);
        obj.LoginClick()
                .emailId("sathiyapriya@gmail.com")
                .Password("12345678")
                .LoginButton()
                .ValidateLogin();
    }
    @Test(priority = 2)
    public static void AddContacts() throws InterruptedException{
        HomePage obj = new HomePage(driver);
        obj.computersTab()
                .AddtoContact()
                .VerifyContactPage()
                .FirstName("Sathiya")
                .LastName("Priya")
                .DateOfBirth("09.09.1981")
                .Email("sathiyapriya@gmail.com")
                .Phone("7200133597")
                .AddressLine1("E1, Taluk Office Road")
                .AddressLine2("Krishnagiri")
                .CityName("Hosur")
                .StateName("Tamilnadu")
                .PostalCode("635110")
                .Country("India")
                .SubmitClick()
                .VerifyAddedContact()
                .logout();
    }
    @Test(priority=3)
    public static void Logout()
    {
        HomePage obj = new HomePage(driver);
        obj.Logout();
    }
}
