import com.codeborne.selenide.Selenide;
import config.BaseTest;
import elements.Group;
import org.junit.jupiter.api.Test;
import pages.Header;
import pages.HomePage;
import pages.LeftPanel;

import static elements.Group.*;

public class Testing extends BaseTest {
    HomePage homePage = new HomePage();
    LeftPanel leftPanel = new LeftPanel();
    Header header = new Header();

    @Test
    public void test() {
        homePage.selectElementsGroup(ELEMENTS);
        leftPanel
                .checkAccordion(ELEMENTS)
                .choseGroup(FORMS)
                .checkAccordion(FORMS)
                .choseItem("Practice Form");

        Selenide.sleep(5000);
    }
}
