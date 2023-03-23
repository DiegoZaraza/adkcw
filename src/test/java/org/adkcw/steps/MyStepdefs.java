package org.adkcw.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.adkcw.pageObject.BasePage;
import org.adkcw.pageObject.ContactPage;
import org.adkcw.pageObject.ThankYouPage;
import org.adkcw.utilities.PropertiesRead;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    private static final String PAGE = PropertiesRead.readFromFrameworkConfig("URL");
    private WebDriver webDriver;
    private SoftAssertions softAssertions;
    private Faker faker;
    private ContactPage contactPage;
    private ThankYouPage thankYouPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        webDriver = WebDriverManager.chromedriver().create();
        contactPage = new ContactPage(webDriver);
        thankYouPage = new ThankYouPage(webDriver);
        softAssertions = new SoftAssertions();
        faker = new Faker();
        webDriver.manage().window().maximize();
    }
    @Given("I enter on the form contact")
    public void iEnterOnTheFormContact() {
        BasePage.setImplicitlyWait();
        webDriver.get(PAGE);
    }

    @When("I enter my First Name")
    public void iEnterMyFirstName() {
        contactPage.setTxtFirstName(faker.name().firstName());
    }

    @And("I enter my Last Name")
    public void iEnterMyLastName() {
        contactPage.setTxtLastName(faker.name().lastName());
    }

    @And("I enter My Work Email")
    public void iEnterMyWorkEmail() {
        contactPage.setTxtEmail(faker.internet().emailAddress());
    }

    @And("I enter my Company Name")
    public void iEnterMyCompanyName() {
        contactPage.setTxtCompany(faker.company().name());
    }

    @And("I enter Phone Number")
    public void iEnterPhoneNumber() {
        contactPage.setTxtPhone(faker.phoneNumber().cellPhone());
    }

    @And("I enter a message")
    public void iEnterAMessage() {
        contactPage.setTxtMessage(faker.superhero().descriptor());
    }

    @Then("I click on button submit")
    public void iClickOnButtonSubmit() {
        BasePage.scrollDown();
        contactPage.clickButton();
        softAssertions.assertThat(thankYouPage.findText());
    }
}
