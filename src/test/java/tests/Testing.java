package tests;

import config.App;
import config.BaseTest;
import org.junit.jupiter.api.Test;

import static constants.Item.*;

public class Testing extends BaseTest {

    @Test
    public void testTextBox() {
        App.textBoxPage.leftPanel().choseItem(TEXTBOX);
        App.textBoxPage
                .fillUserName("Nikita Korkin")
                .fillEmail("nikita@korkin.com")
                .fillCurrentAddress("Moscow")
                .fillPermanentAddress("Moscow")
                .clickSubmitButton();
    }

    @Test
    public void testCheckBox() {
        App.textBoxPage.leftPanel().choseItem(CHECKBOX);
        App.checkBoxPage.test();
        System.out.println("");
    }

    @Test
    public void testRadio() {
        App.textBoxPage.leftPanel().choseItem(RADIOBUTTON);
        App.radioButtonPage.test();
        System.out.println("");
    }

    @Test
    public void testTables() {
        App.textBoxPage.leftPanel().choseItem(WEBTABLES);
        App.webTablesPage.test();
        System.out.println("");
    }
}
