package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage extends BaseTest {
    public CreateAnAccountPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "id_gender1")
    private WebElement mr;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "firstname")
    private WebElement firstName2;

    @FindBy(id = "lastname")
    private WebElement lastName2;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement zipCode;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;

    @FindBy(id = "submitAccount")
    private WebElement buttonSubmit;


    public CreateAnAccountPage enterFirstName (String sendFirstName){
        wdWait.until(ExpectedConditions.elementToBeClickable(firstName));
        firstName.clear();
        firstName.sendKeys(sendFirstName);
        return this;
    }

    public CreateAnAccountPage enterLastName(String sendLastName){
        wdWait.until(ExpectedConditions.elementToBeClickable(lastName));
        lastName.clear();
        lastName.sendKeys(sendLastName);
        return this;
    }

    public CreateAnAccountPage enterEmail(String sendEmail){
        wdWait.until(ExpectedConditions.elementToBeClickable(email));
        email.clear();
        email.sendKeys(sendEmail);
        return this;
    }

    public CreateAnAccountPage enterPassword(String sendPassword){
        wdWait.until(ExpectedConditions.elementToBeClickable(password));
        password.clear();
        password.sendKeys(sendPassword);
        return this;
    }

    public CreateAnAccountPage enterFirstName2(String sendFirstName){
        wdWait.until(ExpectedConditions.elementToBeClickable(firstName2));
        firstName2.clear();
        firstName2.sendKeys(sendFirstName);
        return this;
    }

    public CreateAnAccountPage enterLastName2(String sendLastName){
        wdWait.until(ExpectedConditions.elementToBeClickable(lastName2));
        lastName2.clear();
        lastName2.sendKeys(sendLastName);
        return this;
    }

    public CreateAnAccountPage enterAddress(String sendAddress){
        wdWait.until(ExpectedConditions.elementToBeClickable(address));
        address.clear();
        address.sendKeys(sendAddress);
        return this;
    }

    public CreateAnAccountPage enterCity(String sendCity){
        wdWait.until(ExpectedConditions.elementToBeClickable(city));
        city.clear();
        city.sendKeys(sendCity);
        return this;
    }

    public CreateAnAccountPage enterState (){
        //  wdWait.until(ExpectedConditions.visibilityOf(checkInState));
        //   JavascriptExecutor js = (JavascriptExecutor) driver;
        // WebElement selectInShadowDom1 = (WebElement) js.executeScript("return document.querySelector('#uniform-id_state')");

        // WebElement selectInShadowDom = (WebElement) js.executeScript("return document.querySelector('#uniform-id_state').shadowRoot.querySelector('#id_state')");
        Select select = new Select(state);
        select.selectByValue("30");
        return this;
    }

    public CreateAnAccountPage enterZipCode(String sendZip){
        wdWait.until(ExpectedConditions.elementToBeClickable(zipCode));
        zipCode.clear();
        zipCode.sendKeys(sendZip);
        return this;
    }

    public CreateAnAccountPage enterMobilePhone(String sendMobilePhone){
        wdWait.until(ExpectedConditions.elementToBeClickable(mobilePhone));
        mobilePhone.clear();
        mobilePhone.sendKeys(sendMobilePhone);
        return this;
    }

    public void clickOnButtonSubmit(){
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonSubmit));
        buttonSubmit.click();
    }
}
