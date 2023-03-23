package org.adkcw.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {
    @FindBy(id = "firstname")
    WebElement txtFirstName;
    @FindBy(id = "lastname")
    WebElement txtLastName;
    @FindBy(id = "email")
    WebElement txtEmail;
    @FindBy(id = "company")
    WebElement txtCompany;
    @FindBy(id = "phone")
    WebElement txtPhone;
    @FindBy(id = "message")
    WebElement txtMessage;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement btnSubmit;

    public ContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void setTxtFirstName(String firstName) {
        sendKeys(txtFirstName, firstName, "");
    }

    public void setTxtLastName(String lastName) {
        sendKeys(txtLastName, lastName, "");
    }

    public void setTxtEmail(String email) {
        sendKeys(txtEmail, email, "");
    }

    public void setTxtCompany(String company) {
        sendKeys(txtCompany, company, "");
    }

    public void setTxtPhone(String phone) {
        sendKeys(txtPhone, phone, "");
    }

    public void setTxtMessage(String message) {
        sendKeys(txtMessage, message, "");
    }

    public void clickButton(){
        click(btnSubmit, "");
    }
}
