package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-click='home()']")
    private WebElement homeButton;
    @FindBy(xpath = "//*[@ng-click='customer()']")
    private WebElement customerLoginButton;
    @FindBy(xpath = "//*[@g-click='manager()']")
    private WebElement bankManagerLoginButton;

    public void clickOnHomeButton() {
        click(homeButton);
    }

    public void clickOnCustomerLoginButton() {
        click(customerLoginButton);
    }

    public void clickOnBankManagerLoginButton() {
        click(bankManagerLoginButton);
    }

}
