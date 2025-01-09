package tests;

import base.ProjectSpecification;
import pages.HomePage;

public class TC_003_ProductOrderVerifyTest extends ProjectSpecification {
	
	public static void ProductOrdered() throws InterruptedException
	{
		HomePage obj = new HomePage(driver);
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

}
