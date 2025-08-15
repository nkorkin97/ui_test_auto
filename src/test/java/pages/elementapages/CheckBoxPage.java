package pages.elementapages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import elements.Checked;
import elements.State;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.*;
import static elements.Checked.*;
import static elements.State.COLLAPSED;
import static elements.State.EXPANDED;

public class CheckBoxPage {

    public SelenideElement findAncestorToggle(String nodeName) {
        SelenideElement toggle = $$(".rct-node-parent")
                .findBy(Condition.text(nodeName))
                .$("button");
        return toggle;
    }

    public SelenideElement findChildToggle(String childNodeName) {
        SelenideElement toggle = $$(".rct-node-parent .rct-node-parent")
                .findBy(Condition.text(childNodeName)).$("button");
        return toggle;
    }

    public CheckBoxPage checkToggleExpanded(SelenideElement element, State state) {
        String cssClass = state.getCssClass();
        Assertions.assertThat(element.closest("li").getAttribute("class")).contains(cssClass);
        return this;
    }

    public SelenideElement findAncestorCheckBox(String nodeName) {
        SelenideElement checkbox = $$(".rct-node-parent")
                .findBy(Condition.text(nodeName))
                .$("#tree-node-home").ancestor("label");
        return checkbox;
    }

    public SelenideElement findChildCheckBox(String childNodeName) {
        SelenideElement checkbox = $$(".rct-node-parent .rct-node-parent")
                .findBy(Condition.text(childNodeName))
                .$("label");
        return checkbox;
    }

    public CheckBoxPage checkBoxCheck(SelenideElement element, Checked checked) {
        String cssClass = checked.getCssClass();
        Assertions
                .assertThat(element
                        .$("span[class='rct-checkbox'] svg")
                        .getAttribute("class"))
                .contains(cssClass);
        return this;
    }

    public void test() {
        findAncestorToggle("Home").click();
        findChildToggle("Downloads").click();
        checkToggleExpanded(findAncestorToggle("Home"), EXPANDED);
        findChildCheckBox("Desktop").click();
        checkBoxCheck(findChildCheckBox( "Desktop"), CHECK);
        checkBoxCheck(findAncestorCheckBox("Home"), HALFCHECK);
        checkBoxCheck(findChildCheckBox("Downloads"), UNCHECK);
    }











}
