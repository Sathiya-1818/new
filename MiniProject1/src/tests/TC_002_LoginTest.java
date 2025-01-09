package tests;

import base.ProjectSpecification;
import pages.HomePage;

public class TC_002_LoginTest extends ProjectSpecification {
	
	public static void Login()
	{
		HomePage obj = new HomePage(driver);
		obj.launchandLoad();
		obj.loginClick()
		.mail("meh472@gmail.com")
		.Password("Sathiya86")
		.LoginButton()
		.ValidateLogin();
	}

}
