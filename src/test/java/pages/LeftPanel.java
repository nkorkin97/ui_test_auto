package pages;

import com.codeborne.selenide.Condition;
import elements.Group;

import static com.codeborne.selenide.Selenide.$;

public class LeftPanel {

    public LeftPanel checkAccordion(Group group) {
        $(".accordion")
                .$$(".element-group")
                .findBy(Condition.text(group.returnGroupName()))
                .$(".element-list").shouldHave(Condition.cssClass("show"));

        return this;
    }

    public LeftPanel choseItem(String item) {
        $(".show")
                .$(".menu-list")
                .$$(".btn").findBy(Condition.text(item))
                .scrollTo()
                .click();

        $(".text-center")
                .shouldHave(Condition.text(item));

        return this;
    }

    public LeftPanel choseGroup(Group group) {
        $(".accordion")
                .$$(".element-group")
                .findBy(Condition.text(group.returnGroupName()))
                .scrollTo()
                .click();

        return this;
    }
}
