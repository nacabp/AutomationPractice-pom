package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {
    @FindBy(partialLinkText = "Sign in")
    private WebElement buttonSignIn;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnButtonSignIn() {
        wdWait.until(ExpectedConditions.elementToBeClickable(buttonSignIn));
        buttonSignIn.click();
    }

}
