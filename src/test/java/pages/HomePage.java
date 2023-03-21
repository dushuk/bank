package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.Wait;

public class HomePage extends PageBase {
    Wait wait;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-click='home()']")
    protected WebElement homeButton;
    @FindBy(xpath = "//*[@ng-click='customer()']")
    protected WebElement customerLoginButton;
    @FindBy(xpath = "//*[@g-click='manager()']")
    protected WebElement bankManagerLoginButton;

    public void waitForLoading() {
        wait = new Wait(driver);
        wait.forVisibility(homeButton);
        wait.forVisibility(customerLoginButton);
        wait.forVisibility(bankManagerLoginButton);
    }

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
