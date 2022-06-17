package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends BaseTest {
    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "account")
    private WebElement customerAccount;

    public boolean custumerAccountIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(customerAccount));
        return customerAccount.isDisplayed();
    }

    public String customerAccountText(){
        wdWait.until(ExpectedConditions.visibilityOf(customerAccount));
        return customerAccount.getText();
    }

}
