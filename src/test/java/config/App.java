package config;

import com.codeborne.selenide.Selenide;
import pages.HomePage;
import pages.elementspages.CheckBoxPage;
import pages.elementspages.RadioButtonPage;
import pages.elementspages.TextBoxPage;
import pages.elementspages.webtablespage.WebTablesPage;

public class App {
    public static HomePage homePage = Selenide.page(HomePage.class);
    public static TextBoxPage textBoxPage = Selenide.page(TextBoxPage.class);
    public static CheckBoxPage checkBoxPage = Selenide.page(CheckBoxPage.class);
    public static RadioButtonPage radioButtonPage = Selenide.page(RadioButtonPage.class);
    public static WebTablesPage webTablesPage = Selenide.page(WebTablesPage.class);
}
