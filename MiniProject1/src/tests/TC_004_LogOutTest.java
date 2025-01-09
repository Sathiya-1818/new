package tests;

import base.ProjectSpecification;
import pages.HomePage;

public class TC_004_LogOutTest extends ProjectSpecification {
	
	public static void Logout()
	{
		HomePage obj = new HomePage(driver);
		obj.Logout();
	}


}
