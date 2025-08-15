import com.codeborne.selenide.Selenide;
import config.BaseTest;
import org.junit.jupiter.api.Test;
import pages.basepage.Header;
import pages.HomePage;
import pages.basepage.LeftPanel;
import pages.elementapages.TextBoxPage;

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
                .clickSubmitButton();

        Selenide.sleep(9000);
    }
}
