package config;

import com.codeborne.selenide.Selenide;
import pages.HomePage;
import pages.elementapages.CheckBoxPage;
import pages.elementapages.TextBoxPage;

public class App {
    public static HomePage homePage = Selenide.page(HomePage.class);
    public static TextBoxPage textBoxPage = Selenide.page(TextBoxPage.class);
    public static CheckBoxPage checkBoxPage = Selenide.page(CheckBoxPage.class);
    public static BasePage basePage = Selenide.page(BasePage.class);
}
