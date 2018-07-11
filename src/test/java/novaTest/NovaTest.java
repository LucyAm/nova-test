package novaTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import util.FunctionalTestBase;

import static pages.AccountPage.registeredAccountPageXpath;
import static pages.HomePage.loginXpath;
import static pages.LoginPage.emailXpath;

public class NovaTest extends FunctionalTestBase {
    @Test
    public void test() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin();

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }


}
