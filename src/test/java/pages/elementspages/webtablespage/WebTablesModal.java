package pages.elementspages.webtablespage;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesModal {

    @Step
    public WebTablesModal fillFirstName(String firstName) {
        $("#firstName-wrapper input")
                .scrollTo()
                .shouldBe(Condition.visible)
                .setValue(firstName);
        $("#firstName-wrapper input").shouldHave(Condition.value(firstName));
        return this;
    }

    @Step
    public WebTablesModal fillLasttName(String lastName) {
        $("#lastName-wrapper input")
                .scrollTo()
                .shouldBe(Condition.visible)
                .setValue(lastName);
        $("#lastName-wrapper input").shouldHave(Condition.value(lastName));
        return this;
    }

    @Step
    public WebTablesModal fillEmail(String email) {
        $("#userEmail-wrapper input")
                .scrollTo()
                .shouldBe(Condition.visible)
                .setValue(email);
        $("#userEmail-wrapper input").shouldHave(Condition.value(email));
        return this;
    }

    @Step
    public WebTablesModal fillAge(String age) {
        $("#age-wrapper input")
                .scrollTo()
                .shouldBe(Condition.visible)
                .setValue(age);
        $("#age-wrapper input").shouldHave(Condition.value(age));
        return this;
    }

    @Step
    public WebTablesModal fillSalary(String salary) {
        $("#salary-wrapper input")
                .scrollTo()
                .shouldBe(Condition.visible)
                .setValue(salary);
        $("#salary-wrapper input").shouldHave(Condition.value(salary));
        return this;
    }

    @Step
    public WebTablesModal fillDepartment(String department) {
        $("#department-wrapper input")
                .scrollTo()
                .shouldBe(Condition.visible)
                .setValue(department);
        $("#department-wrapper input").shouldHave(Condition.value(department));
        return this;
    }

    @Step
    public WebTablesModal clickSubmitBtn() {
        $("#submit").scrollTo().shouldBe(Condition.visible).click();
        $(".modal-content").shouldNotBe(Condition.visible);
        return this;
    }

}
