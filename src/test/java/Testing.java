import com.codeborne.selenide.Selenide;
import config.BaseTest;
import elements.Group;
import elements.Item;
import org.junit.jupiter.api.Test;
import pages.Header;
import pages.HomePage;
import pages.LeftPanel;
import pages.TextBoxPage;

import static elements.Group.*;
import static elements.Item.*;

public class Testing extends BaseTest {
    HomePage homePage = new HomePage();
    LeftPanel leftPanel = new LeftPanel();
    Header header = new Header();
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    public void test() {
        homePage.selectElementsGroup(ELEMENTS);
        leftPanel.choseItem(TEXTBOX);
        textBoxPage
                .fillUserName("Nikita Korkin")
                .fillEmail("nikita@korkin.com")
                .fillCurrentAddress("Moscow")
                .fillPermanentAddress("Moscow")
                .clickSubmitButton()
                .checkOutput(
                        "Nikita Korkin",
                        "nikita@korkin.com",
                        "Moscow",
                        "Moscow");

        Selenide.sleep(9000);
    }
}
