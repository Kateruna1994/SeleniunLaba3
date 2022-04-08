package pages;

import org.openqa.selenium.By;

public class MyAccount extends BasePage{
    private final By checkText = By.xpath("//div[@id='content']/h2[text()='My Account']");
    private final By clickButton = By.xpath("//li[@class='dropdown']/a[text()='Components']");
    private final By clickMonitorButton = By.xpath
            ("//ul[@class='list-unstyled']//a[contains(text(),'Monitors')]");




    public String checkTitleAppearsOnTheLeftMenu(){
       return find(checkText).getText();
    }

    public MyAccount clickComponentButton(){
        find(clickButton).click();
        return this;
    }

    public ProductInfoPage clickMonitorButton(){
        find(clickMonitorButton).click();
        return new ProductInfoPage();
    }
}
