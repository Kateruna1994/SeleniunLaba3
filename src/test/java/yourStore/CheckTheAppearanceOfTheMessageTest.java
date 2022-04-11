package yourStore;

import com.github.javafaker.Faker;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CameraPage;

import java.util.ArrayList;
import java.util.List;

public class CheckTheAppearanceOfTheMessageTest extends BaseTest {

  @Test //Task 1
  public void messageAppearsTest() {
    String expectedResult = "Your Account Has Been Created!";
    Faker faker = new Faker();
    String password = faker.internet().password();

    String actualResult = mainPage.clickButton()
        .clickRegisterAccount()
        .enterUerName(faker.name().firstName())
        .enterLastName(faker.name().lastName())
        .enterEmail(faker.internet().emailAddress())
        .enterPhone(faker.phoneNumber().cellPhone())
        .enterPassword(password)
        .enterBeginPassword(password)
        .clickCheckBox()
        .clickContinueButton()
        .expectedText();

    Assertions.assertThat(actualResult)
        .as("Text should be" + " " + expectedResult)
        .isEqualTo(expectedResult);

  }

  @Test //Task 2
  public void checkFirstNameTest() {
    String expectedResultAfterClickContinue = "First Name must be between 1 and 32 characters!";

    Faker faker = new Faker();
    String actualResultAfterClickContinues = mainPage.clickButton()
        .clickRegisterAccount()
        .enterLastName(faker.name().lastName())
        .enterEmail(faker.internet().emailAddress())
        .enterPhone(faker.phoneNumber().cellPhone())
        .enterPassword("chuhchuh2022")
        .enterBeginPassword("chuhchuh2022")
        .clickCheckBox()
        .clickButtonContinueAndCheckForError()
        .checkMessage();

    Assertions.assertThat(actualResultAfterClickContinues)
        .as("After click button Continues should be " + expectedResultAfterClickContinue)
        .isEqualTo(expectedResultAfterClickContinue);
  }

  @Test //Task 3
  public void checkThatTitleAppearsOnTheLeftMenuTest() {
    String expectedResultCheckTitle = "My Account";

    String actualResultCheckTitle = mainPage.clickButton()
        .clickLoginButton()
        .enterEmailAddress("ketringoncharuk1994@gmail.com")
        .enterMyPassword("chuhchuh2022")
        .clickButtonLogin()
        .checkTitleAppearsOnTheLeftMenu();

    Assertions.assertThat(actualResultCheckTitle)
        .as(expectedResultCheckTitle + " Should be on the left menu")
        .isEqualTo(expectedResultCheckTitle);

  }

  @Test //Task 4
  public void CheckThatThereAreTwoItemsInTheWishList() {
    String expectedResult1 = "Samsung SyncMaster 941BW";
    String expectedResult2 = "Apple Cinema 30\"";
    List<String> expectedResults = new ArrayList<>();
    expectedResults.add(expectedResult2);
    expectedResults.add(expectedResult1);

    List<String> wishListHaveTwoMonitor = mainPage.clickButton()
        .clickLoginButton()
        .enterEmailAddress("ketringoncharuk1994@gmail.com")
        .enterMyPassword("chuhchuh2022")
        .clickButtonLogin()
        .getMainMenuBlock().clickComponentButton()
        .getMainMenuBlock().clickMonitorButton()
        .clickButtonAddWishList()
        .clickButtonWishList()
        .checkHowManyMonitorsAreInTheWishList();

    Assertions.assertThat(wishListHaveTwoMonitor)
        .as("There should be two monitors in the letter, namely: " + expectedResult1,
            expectedResult2)
        .isEqualTo(expectedResults);

  }

   @Test //Task 6

  public void check() {
    int expectedResultTotalNumberOfCameras = 2;
    String camera1 = "Canon EOS 5D";
    String camera2 = "Nikon D300";
    double expectedResultOldPrice = 122.00;
    double expectedResultNewPrice = 98.00;
    double expectedResultExPrice = 80.00;

    int nameCamerasProduct = mainPage.clickOnTheCamerasButton()
        .getCamerasFromCameraPage().size();

    CameraPage camerasCardsPage = new CameraPage();
    double actualResultOldPrice = camerasCardsPage.getOldPrice(camera1);
    double actualResultNewPrice = camerasCardsPage.getNewPrice(camera1);
    double actualResultExPrice = camerasCardsPage.getExPrice(camera2);

    SoftAssertions softAssertions = new SoftAssertions();

    softAssertions.assertThat(nameCamerasProduct)
        .as("The page should be " + expectedResultTotalNumberOfCameras + camera1 + camera2)
        .isEqualTo(expectedResultTotalNumberOfCameras);

    softAssertions.assertThat(actualResultOldPrice)
        .as("Old Price should be " + expectedResultOldPrice)
        .isEqualTo(expectedResultOldPrice);

    softAssertions.assertThat(actualResultNewPrice)
        .as("New price should be " + expectedResultNewPrice)
        .isEqualTo(expectedResultNewPrice);

    softAssertions.assertThat(actualResultExPrice)
        .as("Ex price should be " + actualResultExPrice)
        .isEqualTo(expectedResultExPrice);

    softAssertions.assertAll();
  }

}

