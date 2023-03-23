package org.adkcw.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends BasePage{
    @FindBy(xpath = "//div[@class = \"c-wysiwyg u-mt-28 u-mt-0@md\"]/h2")
    WebElement txtThankYou;

    public ThankYouPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean findText(){
        return isDisplayed(txtThankYou, "");
    }
}
