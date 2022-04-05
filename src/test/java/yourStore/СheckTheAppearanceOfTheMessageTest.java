package yourStore;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;

public class СheckTheAppearanceOfTheMessageTest extends BaseTest {

    @Test
    public void messegeAppears() {
        String actualResult = mainPage.enterClickButton()
                .clickRegisterAccount()
                .enterUerName("Katerina")
                .enterLastName("Honcharuk")
                .enterEmail("VovaHoncharuk994@gmail.com")
                .enterPhone("+380967545382")
                .enterPassword("chuhchuh2022")
                .enterBeginPassword("chuhchuh2022")
                .enterCheckBox()
                .enterClickButtonContinue()
                .getText();

        Assertions.assertThat(actualResult)
                .as("Text should be" + " " + expectedResult)
                .isEqualTo(expectedResult);

    }

    @Test
    public void checkFirstName() {
        String actualResultAfterClickContinues = mainPage.enterClickButton()
                .clickRegisterAccount()
                .enterLastName("Honcharuk")
                .enterEmail("ketringoncharuk1994@gmail.com")
                .enterPhone("+380967545382")
                .enterPassword("chuhchuh2022")
                .enterBeginPassword("chuhchuh2022")
                .enterCheckBox()
                .enterClickButtonContinue()
                .checkMessage();

        Assertions.assertThat(actualResultAfterClickContinues)
                .as("After click button Continues should be" + " " + expectedResultAfterClickContinue)
                .isEqualTo(expectedResultAfterClickContinue);
    }

    @Test
    public void checkThatTitleAppearsOnTheLeftMenu() {
        String actualResultCheckTitle = mainPage.enterClickButton()
                .clickLoginButton()
                .enterEmailAddress("ketringoncharuk1994@gmail.com")
                .enterMyPassword("chuhchuh2022")
                .clickButtonLogin()
                .checkTitleAppearsOnTheLeftMenu();

        Assertions.assertThat(actualResultCheckTitle)
                .as(expectedResultCheckTitle + " " + "Shoul be on the left menu")
                .isEqualTo(expectedResultCheckTitle);


    }

}

