package pages;

import org.openqa.selenium.By;

public class MyAccount extends BasePage {

  private final By checkText = By.xpath("//div[@id='content']/h2[text()='My Account']");


  public String checkTitleAppearsOnTheLeftMenu() {
    return find(checkText).getText();
  }


}
