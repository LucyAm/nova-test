package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {
    public static final String registeredAccountPageXpath = "//p[@class='h1']";
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath=registeredAccountPageXpath)
    WebElement registeredAccountPage;



}
