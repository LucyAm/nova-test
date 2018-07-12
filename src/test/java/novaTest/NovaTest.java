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
    /*
    Inputing non registered user's login and password
     */
    @Test
    public void test() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin("likakaul97@gmail.com","rihanna11");

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }
    /*
    Inputing registered user's login and password
     */
    @Test
    public void test1() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin("likakaul97@gmail.com","rihanna12");

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }
    /*
    Logging with empty parameters
     */
    @Test
    public void test2() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin("","");

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }


    /*
    Logging with only one parameter
     */
    @Test
    public void test3() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin("likakaul97@gmail.com","");

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }

    /*
    Logging with only one parameter
     */
    @Test
    public void test4() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin("","rihanna12");

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }

    /*
    Logging with large and not valid parameters
     */
    @Test
    public void test5() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin("jslkdjalkjdlakjdlakjdlakjdlk@gmail.com","sldjakdjsaldjsaldjalsdjlasj");

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }

    /*
    Logging without using '@' in email address
     */
    @Test
    public void test6() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isElementPresent(loginXpath));
        homePage.startLoging();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isElementPresent(emailXpath));
        loginPage.condirmLoggin("likakaul97","rihanna12");

        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isElementPresent(registeredAccountPageXpath));
    }




}
