package tests;

import base.ProjectSpecification;
import pages.HomePage;

public class TC_005_InvalidLoginTest extends ProjectSpecification {
	
	public static void Login()
	{
		HomePage obj = new HomePage(driver);
		obj.launchandLoad();
		obj.loginClick()
		.mail("472@gmail.com")
		.Password("Sathiya")
		.LoginButton()
		.ValidateLogin();
	}

}
