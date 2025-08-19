package pages.elementapages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPage {

    public SelenideElement getRowByNumber(int number) {
        SelenideElement row = $$(".rt-tr-group").get(number);
        return row;
    }

    public SelenideElement getFirstNameCell(SelenideElement row) {
        SelenideElement firstName = row.$$(".rt-td").get(0);
        return firstName;
    }

    public SelenideElement getLastNameCell(SelenideElement row) {
        SelenideElement firstName = row.$$(".rt-td").get(1);
        return firstName;
    }

    public SelenideElement getAgeCell(SelenideElement row) {
        SelenideElement firstName = row.$$(".rt-td").get(2);
        return firstName;
    }

    public SelenideElement getEmailCell(SelenideElement row) {
        SelenideElement firstName = row.$$(".rt-td").get(3);
        return firstName;
    }

    public SelenideElement getDepartmentCell(SelenideElement row) {
        SelenideElement firstName = row.$$(".rt-td").get(4);
        return firstName;
    }

    public WebTablesPage clickEditButton(SelenideElement row) {
        row.$$(".rt-td")
                .get(6)
                .$("span[title='Edit']")
                .scrollTo()
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    public WebTablesPage clickDeleteButton(SelenideElement row) {
        row.$$(".rt-td")
                .get(6)
                .$("span[title='Delete']")
                .scrollTo()
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    public void test() {
        SelenideElement row = getRowByNumber(1);
        System.out.println(getFirstNameCell(row).getText());
        clickDeleteButton(row);
    }
}
