package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import config.BaseTest;
import elements.Group;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
