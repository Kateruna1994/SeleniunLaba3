package pages;

import org.openqa.selenium.By;

import javax.xml.transform.sax.SAXResult;

public class ResultPage extends BasePage {
    private final By result = By.xpath("//div[@id='content']/h1[text()='Your Account Has Been Created!']");
    private final By clickFirstName = By.xpath
            ("//div[@class='col-sm-10']/div[text()='First Name must be between 1 and 32 characters!']");

    public String getText(){
       return find(result).getText();
    }
    public String checkMessage(){
        return find(clickFirstName).getText();
    }

}
