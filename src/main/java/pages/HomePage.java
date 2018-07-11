package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    public static final String loginXpath = "//div[@class='topbar-link sign red-bg']/a[1]";

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = loginXpath)
    WebElement login;

    public LoginPage startLoging() {
        login.click();
        return new LoginPage(driver);
    }

}
