package pages.elementapages.webtablespage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPage {

    private WebTablesModal webTablesModal = Selenide.page(WebTablesModal.class);

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
        $(".modal-content").shouldBe(Condition.visible);
        return this;
    }

    public WebTablesPage clickAddButton() {
        $("#addNewRecordButton").shouldBe(Condition.visible).scrollTo().click();
        $(".modal-content").shouldBe(Condition.visible);
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

    public WebTablesPage searchRow(String value) {
        $("#searchBox").scrollTo().shouldBe(Condition.visible).setValue(value);
        return this;
    }

    public void test() {
        clickAddButton();
        webTablesModal
                .fillFirstName("Nikita")
                .fillLasttName("Korkin")
                .fillEmail("korkin@nikita.org")
                .fillAge("27")
                .fillSalary("99999")
                .fillDepartment("LIGA").clickSubmitBtn();
        searchRow("9999");
        SelenideElement row = getRowByNumber(0);
        clickEditButton(row);
        webTablesModal.fillFirstName("Korkin").clickSubmitBtn();
        clickDeleteButton(row);
        searchRow("");

    }
}
