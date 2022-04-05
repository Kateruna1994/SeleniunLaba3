package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        
        return driver;
    }

    public static void setDriver(WebDriver webDriver) {
        
        driver = webDriver;
    }
    public WebElement find(By locator) {
        return  getDriver().findElement(locator);
    }


////    public WebElement waitUtilVisible(By locator, int seconds) {
////        return new WebDriverWait(getDriver(), Duration.ofSeconds(seconds))
////                .until(ExpectedConditions.visibilityOfElementLocated(locator));
//}

}
