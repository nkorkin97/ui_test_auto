package pages.elementapages;

import com.codeborne.selenide.Condition;
import config.BasePage;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage extends BasePage {

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

    public TextBoxPage checkNameOutput(String name) {
        $("#output .border").$("#name")
                .scrollTo()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(name));
        return this;
    }
    public TextBoxPage checkEmailOutput(String email) {
        $("#output .border").$("#email")
                .scrollTo()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(email));
        return this;
    }
    public TextBoxPage checkCurrentAddressOutput(String currentAddress) {
        $("#output .border").$("#currentAddress")
                .scrollTo()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(currentAddress));
        return this;
    }
    public TextBoxPage checkPermanentAddressOutput(String permanentAddress) {
        $("#output .border").$("#permanentAddress")
                .scrollTo()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(permanentAddress));
        return this;
    }
}
