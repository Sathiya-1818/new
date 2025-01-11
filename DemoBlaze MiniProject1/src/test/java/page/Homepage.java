package page;

import base.ProjectSpecificationMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Homepage extends ProjectSpecificationMethod {

	public Homepage(WebDriver driver){
		this.driver = driver;

	}
	public RegisterPage registerclick(){
		driver.findElement(By.className("ico-register")).click();
		return new RegisterPage(driver);
	}
	public LoginPage loginClick(){
		driver.findElement((By.className("ico-login"))).click();
		return new LoginPage(driver);
	}
	public Homepage validateLogin(String testCase, String expected) {

		if(testCase.equals("ValidEmailAndValidPassword")) {

			WebElement mailid = driver.findElement(By.className("account"));

			String actualId = mailid.getText();

			Assert.assertEquals(actualId, expected);

		} else if(testCase.equals("InvalidEmailAndValidPassword")) {

			String actual = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]")).getText();

			SoftAssert assertObj = new SoftAssert();
			assertObj.assertEquals(actual, expected);
			assertObj.assertAll();
		}
		return this;
	}
	public MainScreen computersTab()
	{
		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]")).click();
		
		return new MainScreen(driver);
	}
	public Homepage Logout()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/logout\"]")));
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		
		return this;
		
	}
	






}
