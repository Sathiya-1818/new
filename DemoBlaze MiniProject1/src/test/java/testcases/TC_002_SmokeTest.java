package testcases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import page.Homepage;

public class TC_002_SmokeTest extends ProjectSpecificationMethod {
    @DataProvider
    public Object[][] data(){
        return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
    }

    @Test(dataProvider = "data")
    public void test(String d) {
        Assert.assertEquals("First Line\nSecond Line", "First Line\nSecond Line");
    }

    @Test(priority=1)
    public void loginTest(String email, String password, String type, String message){
        // TODO Auto-generated method stub

        Homepage obj = new Homepage(driver);
        obj.loginClick()
                .mail(email)
                .Password(password)
                .LoginButton()
                .validateLogin(type,message);
    }
    @Test(priority=2)
    public static void ProductOrdered() throws InterruptedException
    {
        Homepage obj = new Homepage(driver);
        obj.computersTab()
                .clickDesktop()
                .addProduct()
                .addtoCart()
                .gotoCart()
                .verifyProduct()
                .terms()
                .checkOut()
                .addressCondition()
                .continuebtn()
                .continue2()
                .continue3()
                .continue4()
                .continue5()
                .confirm()
                .verifyOrderPlacement();
    }
    @Test(priority=3)
    public static void Logout()
    {
        Homepage obj = new Homepage(driver);
        obj.Logout();
        driver.close();
    }
}
