package pages.elementspages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RadioButtonPage extends BasePage {

    public SelenideElement findButton(String radioName) {
        SelenideElement radioButton = $$(".custom-radio")
                .findBy(Condition.text(radioName))
                .$("label");
        return radioButton;
    }

    @Step
    public RadioButtonPage clickRadio(String radioName) {
        findButton(radioName).scrollTo().shouldBe(Condition.visible).click();
        return this;
    }

    @Step
    public RadioButtonPage checkResult(String radioName) {
        $(".text-success")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(radioName));
        return this;
    }

    @Step
    public RadioButtonPage checkDisabled(String radioName) {
        findButton(radioName).shouldBe(Condition.visible).shouldHave(Condition.cssClass("disabled"));
        return this;
    }

    public void test() {
        clickRadio("Yes")
                .checkResult("Yes")
                .clickRadio("Impressive")
                .checkResult("Impressive")
                .checkDisabled("No")
                .checkResult("Impressive");
    }
}
