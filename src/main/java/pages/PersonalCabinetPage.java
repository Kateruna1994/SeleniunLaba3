package pages;

import org.openqa.selenium.By;

public class PersonalCabinetPage extends BasePage {

  private final By result = By.xpath(
      "//div[@id='content']/h1[text()='Your Account Has Been Created!']");

  public String expectedText() {
    return find(result).getText();
  }


}
