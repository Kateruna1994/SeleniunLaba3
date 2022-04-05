package yourStore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.MainPage;

public class BaseTest {
    MainPage mainPage = new MainPage();
    String expectedResult = "Your Account Has Been Created!";
    String expectedResultAfterClickContinue = "First Name must be between 1 and 32 characters!";
    String expectedResultCheckTitle = "My Account";


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-site-isolation-trials");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        BasePage.setDriver(driver);
    }

    @AfterMethod
    public void quite(){
        BasePage.getDriver().quit();
    }
}
