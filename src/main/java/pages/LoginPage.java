package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    public static final String emailXpath = "//div/input[@type='email']";
    public static final String passwordXpath = "//div/input[@type='password']";
    public static final String enterXpath = "//div/button[@class='button submit red-bg w-100']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = emailXpath)
    WebElement email;
    @FindBy(xpath = passwordXpath)
    WebElement password;
    @FindBy(xpath = enterXpath)
    WebElement enter;

    public AccountPage condirmLoggin() {
        email.sendKeys("likakaul97@gmail.com");
        password.sendKeys("rihanna11");
        enter.click();
        return new AccountPage(driver);

    }
}
