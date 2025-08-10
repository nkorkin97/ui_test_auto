package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {

    public TextBoxPage fillUserName(String fullName) {
        $("#userName")
                .scrollTo()
                .shouldHave(Condition.attribute("placeholder", "Full Name"))
                .setValue(fullName)
                .sendKeys(Keys.TAB);
        $("#userName")
                .scrollTo()
                .shouldHave(Condition.value(fullName));
        return this;
    }

    public TextBoxPage fillEmail(String userEmail) {
        $("#userEmail")
                .scrollTo()
                .shouldHave(Condition.attribute("placeholder", "name@example.com"))
                .setValue(userEmail)
                .sendKeys(Keys.TAB);
        $("#userEmail")
                .scrollTo()
                .shouldHave(Condition.value(userEmail));
        return this;
    }

    public TextBoxPage fillCurrentAddress(String currentAddress) {
        $("#currentAddress")
                .scrollTo()
                .shouldHave(Condition.attribute("placeholder", "Current Address"))
                .setValue(currentAddress)
                .sendKeys(Keys.TAB);
        $("#currentAddress")
                .scrollTo()
                .shouldHave(Condition.value(currentAddress));
        return this;
    }

    public TextBoxPage fillPermanentAddress(String permanentAddress) {
        $("#permanentAddress")
                .scrollTo()
                .setValue(permanentAddress)
                .sendKeys(Keys.TAB);
        $("#permanentAddress")
                .scrollTo()
                .shouldHave(Condition.value(permanentAddress));
        return this;
    }

    public TextBoxPage clickSubmitButton() {
        $("#submit").scrollTo().click();
        return this;
    }

    public TextBoxPage checkOutput(
            String name,
            String email,
            String currentAddress,
            String permanentAddress
    ) {
        $("#output .border").$("#name")
                .scrollTo()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(name));
        $("#output .border").$("#email")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(email));
        $("#output .border").$("#currentAddress")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(currentAddress));
        $("#output .border").$("#permanentAddress")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(permanentAddress));

        return this;
    }
}
