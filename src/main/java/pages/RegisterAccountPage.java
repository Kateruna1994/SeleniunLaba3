package pages;

import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {
    private final By clickFieldUserName = By.xpath
            ("//input[@id='input-firstname']");
    private final By clickFieldLastName = By.xpath
            ("//div[@class='col-sm-10']/input[@id='input-lastname']");
    private final By clickFieldEmail = By.xpath("//div[@class='col-sm-10']/input[@id='input-email']");
    private final By clickFieldPhone = By.xpath("//div[@class='col-sm-10']/input[@id='input-telephone']");
    private final By clickPassword = By.xpath("//div[@class='col-sm-10']/input[@id='input-password']");
    private final By clickBeginPassword = By.xpath("//div[@class='col-sm-10']/input[@id='input-confirm']");
    private final By cliclOnTheCheckBox = By.xpath("//input[@type='checkbox']");
    private final By clickOnButtonContinue = By.xpath("//input[@value='Continue']");
    private final By clickFieldEnterEmail = By.xpath("//div[@class='form-group']/input[@id='input-email']");
    private final By clickFieldMyPassword = By.xpath("//div[@class='form-group']/input[@id='input-password']");
    private final By clickOnButtonLogin = By.xpath("//input[@type='submit']");
    private final By clickFirstName = By.xpath
            ("//div[@class='col-sm-10']/div[text()='First Name must be between 1 and 32 characters!']");


    public RegisterAccountPage enterUerName(String name) {
        find(clickFieldUserName).sendKeys(name);
        return this;
    }

    public RegisterAccountPage enterLastName(String lastName) {
        find(clickFieldLastName).sendKeys(lastName);
        return this;
    }

    public RegisterAccountPage enterEmail(String email) {
        find(clickFieldEmail).sendKeys(email);
        return this;
    }

    public RegisterAccountPage enterEmailAddress(String email) {
        find(clickFieldEnterEmail).sendKeys(email);
        return this;
    }

    public RegisterAccountPage enterPhone(String phone) {
        find(clickFieldPhone).sendKeys(phone);
        return this;
    }

    public RegisterAccountPage enterPassword(String password) {
        find(clickPassword).sendKeys(password);
        return this;
    }

    public RegisterAccountPage enterMyPassword(String myPassword) {
        find(clickFieldMyPassword).sendKeys(myPassword);
        return this;
    }


    public RegisterAccountPage enterBeginPassword(String beginPassword) {
        find(clickBeginPassword).sendKeys(beginPassword);
        return this;
    }

    public RegisterAccountPage clickCheckBox() {
        find(cliclOnTheCheckBox).click();
        return this;
    }

    public PersonalCabinetPage clickContinueButton() {
        find(clickOnButtonContinue).click();
        return new PersonalCabinetPage();
    }

    public RegisterAccountPage clickButtonContinueAndCheckForError() {
        find(clickOnButtonContinue).click();
        return this;
    }

    public String checkMessage() {
        return find(clickFirstName).getText();
    }

    public MyAccount clickButtonLogin() {
        find(clickOnButtonLogin).click();
        return new MyAccount();
    }


}
