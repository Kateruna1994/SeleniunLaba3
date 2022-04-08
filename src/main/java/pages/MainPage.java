package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private final By clickButton = By.xpath("//a[@title='My Account']");
    private final By clickButtonRegister = By.xpath
            ("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']");
    private final By clickButtonLogin = By.xpath
            ("//ul[contains(@class,'dropdown-menu')]//a[text()='Login']");


    public MainPage clickButton(){
        find(clickButton).click();
        return this;
    }
    public RegisterAccountPage clickRegisterAccount(){
        find(clickButtonRegister).click();
        return new RegisterAccountPage();
    }

    public RegisterAccountPage clickLoginButton(){
        find(clickButtonLogin).click();
        return new RegisterAccountPage();
    }

}
