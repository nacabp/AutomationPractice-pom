package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class AuthenticationPage extends BaseTest {
    public AuthenticationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email_create")
    private WebElement emailAddress;

    @FindBy(css = ".icon-user.left")
    private WebElement createAnAccount;

    public AuthenticationPage enterEmailAddress(String sendEmail){
        wdWait.until(ExpectedConditions.elementToBeClickable(emailAddress));
        emailAddress.clear();
        emailAddress.sendKeys(sendEmail);
        return this;
    }

    public void clickOnCreateAnAccount (){
        wdWait.until(ExpectedConditions.elementToBeClickable(createAnAccount));
        createAnAccount.click();
    }

}
