package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	@FindBy(className = "ico-register")
	WebElement register;
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public RegisterPage registerclick(){
		driver.findElement(By.className("ico-register")).click();
		return new RegisterPage();
	}
	public LoginPage loginClick(){
		driver.findElement((By.className("ico-login"))).click();
		return new LoginPage(driver);
	}
	public HomePage ValidateLogin(){
		String ExpectedId = "meh472@gmail.com";
		WebElement MailId = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));

		VisibilityofElement(MailId);
		String ActualId = MailId.getText();
		System.out.println(ActualId);

		if(ExpectedId.equalsIgnoreCase(ActualId)){
			System.out.println("Registration is Successfull");
		}else{
			System.out.println("Registration is Unsuccessfull");
		}
		return this;
	}
	public MainScreen computersTab()
	{
		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]")).click();
		
		return new MainScreen(driver);
	}
	public HomePage Logout()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/logout\"]")));
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		
		return this;
		
	}
	
}