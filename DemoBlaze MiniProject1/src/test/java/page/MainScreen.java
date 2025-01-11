package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethod;

public class MainScreen extends ProjectSpecificationMethod{

	public MainScreen(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void computersTab()
	{
		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]")).click();
	}
	public MainScreen clickDesktop()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href=\"/desktops\"])[4]")));
		element.click();
		return this;
	}
	public MainScreen addProduct()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/72/1/1    ');return false;\"]")));
		element.click();
		return this;
	}
	public MainScreen addtoCart() throws InterruptedException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"add-to-cart-button-72\"]")));
		element.click();
		return this;
	}
	public MainScreen gotoCart() throws InterruptedException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'(1)')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
        return this;
	}
	public MainScreen verifyProduct()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"product-name\"]")));
		driver.findElement(By.xpath("//a[@class=\"product-name\"]")).isDisplayed();
		return this;
	}
	public MainScreen checkOut()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"checkout\"]")));
		driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		return this;
	}
	public MainScreen terms()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"termsofservice\"]")));
		driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
		return this;
	}
	public MainScreen addressCondition()
	{
		if (driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]")).isDisplayed()) {
			cityName("Chennai");
			AddressLine1("Chennai1");
			postalCode("600097");
			mobileNumber("9876543210");
			selectCountry();
		}
		return this;
	}
	public MainScreen cityName(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"BillingNewAddress_City\"]")));
		element.sendKeys(name);
		return this;
	}
	public MainScreen AddressLine1(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]")));
		element.sendKeys(name);
		return this;
	}
	public MainScreen postalCode(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]")));
		element.sendKeys(name);
		return this;
	}
	public MainScreen mobileNumber(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]")));
		element.sendKeys(name);
		return this;
	}
	public MainScreen continuebtn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@title=\"Continue\"])[1]")));
		element.click();
		return this;
	}
	public MainScreen selectCountry()
	{
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]"));
        Select select = new Select(dropdown);
        select.selectByValue("India");
        return this;

	}
	public MainScreen continue2()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@title=\"Continue\"])[last()]")));
		driver.findElement(By.xpath("(//input[@title=\"Continue\"])[last()]")).click();
		return this;
	}
	public MainScreen continue3()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]")));
		driver.findElement(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]")).click();
		return this;
	}
	public MainScreen continue4()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]")));
		driver.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]")).click();
		return this;
	}
	public MainScreen continue5()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]")));
		driver.findElement(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]")).click();
		return this;
	}
	public MainScreen confirm()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Sub-Total:')]")));
		driver.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]")).click();
		return this;
	}
	public MainScreen verifyOrderPlacement()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")));
		driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")).isDisplayed();
		return this;
	}
	public MainScreen logout()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/logout\"]")));
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		return this;
	}


}
