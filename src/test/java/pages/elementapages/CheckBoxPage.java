package pages.elementapages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import constants.Checked;
import constants.State;
import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;
import config.BasePage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage extends BasePage {

    @Step()
    public CheckBoxPage expandAllBtn() {
        $x("//button[@aria-label='Expand all']")
                .scrollTo()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step
    public CheckBoxPage collapseAllBtn() {
        $x("//button[@aria-label='Collapse all']")
                .scrollTo()
                .shouldBe(visible)
                .click();
        return this;
    }

    public SelenideElement findNode(String nodeName) {
        SelenideElement node = $$(".rct-node-parent")
                .findBy(text(nodeName));
        return node;
    }

    public SelenideElement findNode(SelenideElement element, String childNodeName) {
        SelenideElement node = element.$$(".rct-node-parent")
                .findBy(text(childNodeName));
        return node;
    }

    public SelenideElement findLeaf(SelenideElement element, String leafName) {
        SelenideElement leaf = element.$$(".rct-node-leaf").findBy(text(leafName));
        return leaf;
    }

    @Step
    public CheckBoxPage clickToggle(SelenideElement element) {
        element.$("button")
                .scrollTo()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step
    public CheckBoxPage toggleState(SelenideElement element, State state) {
        String cssClass = state.getCssClass();
        Assertions.assertThat(element.closest("li").getAttribute("class")).contains(cssClass);
        return this;
    }

    @Step
    public CheckBoxPage clickCheckBox(SelenideElement element) {
        element.$("label")
                .scrollTo()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step
    public CheckBoxPage checkboxState(SelenideElement element, Checked checked) {
        String cssClass = checked.getCssClass();
        Assertions
                .assertThat(element
                        .$("span[class='rct-checkbox'] svg")
                        .getAttribute("class"))
                .contains(cssClass);
        return this;
    }

    @Step
    public CheckBoxPage checkResult(String itemName) {
        $("#result").scrollTo().$$(".text-success").findBy(text(itemName)).shouldBe(visible);
        return this;
    }

    public void test() {
        SelenideElement homeNode = findNode("Home");
        SelenideElement documentsNode = findNode(homeNode, "Documents");
        SelenideElement officeNode = findNode(documentsNode, "Office");
        SelenideElement publicLeaf = findLeaf(officeNode, "Public");

        clickToggle(homeNode)
                .clickToggle(documentsNode)
                .clickToggle(officeNode)
                .clickCheckBox(publicLeaf)
                .checkResult("Public");
    }

}
