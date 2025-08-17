package constants;

public enum Item {
    TEXTBOX("Text Box"),
    CHECKBOX("Check Box"),
    RADIOBUTTON("Radio Button"),
    WEBTABLES("Web Tables"),
    BUTTONS("Buttons"),
    LINKS("Links"),
    BROKENLINKS("Broken Links - Images"),
    UPLOADDOWNLOAD("Upload and Download"),
    DYNAMICPROPERTIES("Dynamic Properties");

    private final String itemName;
    Item(String itemName) {
        this.itemName = itemName;
    }

    public String returnItemName() {
        return itemName;
    }
}
