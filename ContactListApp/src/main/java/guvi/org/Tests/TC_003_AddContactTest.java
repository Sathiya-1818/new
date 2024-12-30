package guvi.org.Tests;

import guvi.org.Base.ProjectSpecification;
import guvi.org.Page.HomePage;

public class TC_003_AddContactTest extends ProjectSpecification {

    public static void main(String[] args) throws InterruptedException {

        HomePage obj = new HomePage(driver);
        obj.LaunchandLoad();
        obj.computersTab()
                .AddtoContact()
                .VerifyContactPage()
                .FirstName("Suresh")
                .LastName("kunar")
                .DateOfBirth("09.09.1981")
                .Email("sk007@gmail.com")
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
}
