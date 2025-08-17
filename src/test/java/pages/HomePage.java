package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import config.BaseTest;
import constants.Group;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BaseTest {


    public void selectElementsGroup(Group group) {
        $(".category-cards")
                .$$(".card-body")
                .findBy(Condition.text(group.returnGroupName()))
                .scrollTo()
                .click();

        Assertions
                .assertThat((WebDriverRunner.getWebDriver().getCurrentUrl()).contains(group.returnEndpoint()));
    }


}
