package pages.bankManagerLogin.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.PageBase;
import wait.Wait;


public class CustomersPage extends PageBase {
    public CustomersPage(WebDriver driver) {
        super(driver);
    }

    Wait wait;

    @FindBy(className = "table")
    WebElement tableBody;

    @FindBy(xpath = "//*[@placeholder='Search Customer']")
    WebElement searchCustomerInput;

    public void waitForLoading() {
        wait = new Wait(driver);
        wait.forVisibility(searchCustomerInput);
        wait.forVisibility(tableBody);
    }

    public void fillSearchCustomerInput(String firstName) {
        fillField(searchCustomerInput, firstName);
    }

    public WebElement makeTableRow(String columnName) {
        return driver.findElement(By.xpath("//*[contains(text()," + columnName + ")]/ancestor::*[@class='ng-scope']"));
    }

    public void checkExistingCustomer(Number expectedCountRow) {
        Number actualCountRow = driver.findElements(By.xpath("//*[@ng-repeat='cust in Customers | orderBy:sortType:sortReverse | filter:searchCustomer']")).size();
        Assert.assertEquals(actualCountRow, expectedCountRow);
    }


    public void deleteTableRow(String columnName) {
        makeTableRow(columnName).findElement(By.xpath("//*[@ng-click='deleteCust(cust)']"));
    }


}
