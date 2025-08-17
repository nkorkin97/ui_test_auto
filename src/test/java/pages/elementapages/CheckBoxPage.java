package pages.elementapages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import constants.Checked;
import constants.State;
import org.assertj.core.api.Assertions;
import config.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage extends BasePage {

    public SelenideElement findAncestorNode(String nodeName) {
        SelenideElement node = $$(".rct-node-parent")
                .findBy(Condition.text(nodeName));
        return node;
    }

    public SelenideElement findChildNode(SelenideElement element, String childNodeName) {
        SelenideElement node = element.$$(".rct-node-parent")
                .findBy(Condition.text(childNodeName));
        return node;
    }
    public SelenideElement findToggle(SelenideElement element) {
        SelenideElement toggle = element.$("button");
        return toggle;
    }

    public CheckBoxPage checkToggleState(SelenideElement element, State state) {
        String cssClass = state.getCssClass();
        Assertions.assertThat(element.closest("li").getAttribute("class")).contains(cssClass);
        return this;
    }

    public SelenideElement findCheckBox(SelenideElement element) {
        SelenideElement checkbox = element.$("label");
        return checkbox;
    }

    public CheckBoxPage checkBoxState(SelenideElement element, Checked checked) {
        String cssClass = checked.getCssClass();
        Assertions
                .assertThat(element
                        .$("span[class='rct-checkbox'] svg")
                        .getAttribute("class"))
                .contains(cssClass);
        return this;
    }

    public SelenideElement findLeaf(SelenideElement element, String leafName) {
        SelenideElement leaf = element.$$(".rct-node-leaf").findBy(Condition.text(leafName));
        return leaf;
    }

//    public void test() {
//        SelenideElement homeNode = findAncestorNode("Home");
//        SelenideElement documentsNode = findChildNode(homeNode, "Documents");
//        SelenideElement officeNode = findChildNode(documentsNode, "Office");
//        SelenideElement leaf = findLeaf(officeNode, "Public");
//
//        findToggle(homeNode).click();
//        findToggle(documentsNode).click();
//        findToggle(officeNode).click();
//        findCheckBox(leaf).click();
//    }

}
