package yourStore;

import com.github.javafaker.Faker;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class CheckTheAppearanceOfTheMessageTest extends BaseTest {

    @Test
    public void messageAppearsTest() {
        String expectedResult = "Your Account Has Been Created!";

        Faker faker = new Faker();
                String actualResult = mainPage.clickButton()
                .clickRegisterAccount()
                .enterUerName(faker.name().firstName())
                .enterLastName(faker.name().lastName())
                .enterEmail(faker.internet().emailAddress())
                .enterPhone(faker.phoneNumber().cellPhone())
                .enterPassword(faker.internet().password())
                .enterBeginPassword(faker.internet().password())
                .clickCheckBox()
                .clickContinueButton()
                .expectedText();

        Assertions.assertThat(actualResult)
                .as("Text should be" + " " + expectedResult)
                .isEqualTo(expectedResult);

    }

    @Test
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
                .as("After click button Continues should be" + " " + expectedResultAfterClickContinue)
                .isEqualTo(expectedResultAfterClickContinue);
    }

    @Test
    public void checkThatTitleAppearsOnTheLeftMenuTest() {
        String expectedResultCheckTitle = "My Account";

        String actualResultCheckTitle = mainPage.clickButton()
                .clickLoginButton()
                .enterEmailAddress("ketringoncharuk1994@gmail.com")
                .enterMyPassword("chuhchuh2022")
                .clickButtonLogin()
                .checkTitleAppearsOnTheLeftMenu();

        Assertions.assertThat(actualResultCheckTitle)
                .as(expectedResultCheckTitle + " " + "Should be on the left menu")
                .isEqualTo(expectedResultCheckTitle);

    }

    @Test
    public void CheckThatThereAreTwoItemsInTheWishList(){
        mainPage.clickButton()
                .clickLoginButton()
                .enterEmailAddress("ketringoncharuk1994@gmail.com")
                .enterMyPassword("chuhchuh2022")
                .clickButtonLogin()
                .clickComponentButton()
                .clickMonitorButton()
                .clickButtonAddWishList()
                .clickButtonWishList()
                .getAllProductsFromProductInfoPage();

    }

}

