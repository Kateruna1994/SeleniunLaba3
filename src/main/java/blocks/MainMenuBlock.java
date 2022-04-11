package blocks;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CameraPage;
import pages.MainPage;
import pages.MyAccount;
import pages.ProductInfoPage;

@Getter
@Setter
@EqualsAndHashCode

public class MainMenuBlock {

  private static WebDriver driver;
  Actions actions = new Actions(driver);


  private final By clickButton = By.xpath("//li[@class='dropdown']/a[text()='Components']");
  private final By clickMonitorButton = By.xpath
      ("//ul[@class='list-unstyled']//a[contains(text(),'Monitors')]");
//  private final By checkCurrencyButton = By.xpath("//div[@class='btn-group']/button");


  public MainMenuBlock(WebDriver webDriver) {
    driver = webDriver;

  }

  public MyAccount clickComponentButton() {
    driver.findElement(clickButton).click();
    return new MyAccount();
  }

  public ProductInfoPage clickMonitorButton() {
    driver.findElement(clickMonitorButton).click();
    return new ProductInfoPage();
  }

//  public MainPage hoverOverTheCurrencyButton(){
//   actions.moveToElement(driver.findElement(checkCurrencyButton)).build().perform();
//   return new MainPage();
//  }


}
