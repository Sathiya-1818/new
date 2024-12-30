package guvi.org.Page;

import guvi.org.Base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactListPage extends ProjectSpecification {
    public ContactListPage(WebDriver ldriver)
    {
        this.driver = ldriver;
    }
    public void computersTab()
    {
        driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]")).click();
    }
    public ContactListPage clickDesktop()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href=\"/desktops\"])[4]")));
        element.click();
        return this;
    }

    public ContactListPage VerifyContactPage()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/h1")));
        driver.findElement(By.xpath("/html/body/div[1]/header/h1")).isDisplayed();
        return this;
    }
    public ContactListPage AddtoContact() throws InterruptedException
    {
        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-contact\"]")));
        element.click();
        return this;
    }
    public ContactListPage FirstName(String fname)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"firstName\"]")));
        element.sendKeys(fname);
        return this;
    }
    public ContactListPage LastName(String lname)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lastName\"]")));
        element.sendKeys(lname);
        return this;
    }
    public ContactListPage DateOfBirth(String dob)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"birthdate\"]")));
        element.sendKeys(dob);
        return this;
    }
    public ContactListPage Email(String mail)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
        element.sendKeys(mail);
        return this;
    }
    public ContactListPage Phone(String no)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"phone\"]")));
        element.sendKeys(no);
        return this;
    }
    public ContactListPage AddressLine1(String line1)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"street1\"]")));
        element.sendKeys(line1);
        return this;
    }
    public ContactListPage AddressLine2(String line2)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"street2\"]")));
        element.sendKeys(line2);
        return this;
    }
    public ContactListPage CityName(String city)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"city\"]")));
        element.sendKeys(city);
        return this;
    }
    public ContactListPage StateName(String state)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"stateProvince\"]")));
        element.sendKeys(state);
        return this;
    }
    public ContactListPage PostalCode(String code)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"postalCode\"]")));
        element.sendKeys(code);
        return this;
    }
    public ContactListPage Country(String cname)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-contact\"]/p[7]")));
        element.sendKeys(cname);
        return this;
    }
    public ContactListPage SubmitClick()
    {
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        return this;
    }
    public ContactListPage VerifyAddedContact()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myTable\"]/tr/td[2] , 'Your contact has been added successfully!')]")));
        driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr/td[2] , 'Your contact has been added successfully!')]")).isDisplayed();
        return this;
    }
    public ContactListPage logout()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
        return this;
    }
}
