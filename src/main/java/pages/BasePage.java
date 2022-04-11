package pages;

import blocks.MainMenuBlock;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class BasePage {

  private static WebDriver driver;


  public static WebDriver getDriver() {
    return driver;
  }

  public static void setDriver(WebDriver webDriver) {
    driver = webDriver;
  }

  private MainMenuBlock mainMenuBlock = new MainMenuBlock(driver);

  public MainMenuBlock getMainMenuBlock() {
    return mainMenuBlock;
  }

  public WebElement find(By locator) {
    return getDriver().findElement(locator);
  }
}
