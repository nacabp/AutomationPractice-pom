package Tests;

import Base.BaseTest;
import Pages.AuthenticationPage;
import Pages.CreateAnAccountPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class AutomationPractiseTest extends BaseTest {
    private HomePage homePage;
    private AuthenticationPage authenticationPage;
    private Random random = new Random();
    private String regMail = "practise" + random.nextInt(1000) + "@test.com";
    private CreateAnAccountPage createAnAccountPage;
    private String firstN = "Bob";
    private String lastN = "Pit";
    private MyAccountPage myAccountPage;


    @Before
    public void setUpTest(){
        homePage = new HomePage();
        authenticationPage = new AuthenticationPage();
        createAnAccountPage = new CreateAnAccountPage();
        myAccountPage = new MyAccountPage();

    }

    @Test
    public void createAccountTest(){
        homePage.clickOnButtonSignIn();
        authenticationPage.enterEmailAddress(regMail)
                .clickOnCreateAnAccount();
        createAnAccountPage.enterFirstName(firstN)
                .enterLastName(lastN)
                .enterEmail(regMail)
                .enterPassword("12345")
                .enterFirstName2(firstN)
                .enterLastName2(lastN)
                .enterAddress("103 Way Msn")
                .enterCity("Barnegat")
                .enterState()
                .enterZipCode("08005")
                .enterMobilePhone("(609) 698-2557")
                .clickOnButtonSubmit();
        Assert.assertTrue(myAccountPage.custumerAccountIsDisplayed());
        Assert.assertEquals(firstN + " " + lastN,myAccountPage.customerAccountText());

    }
}
