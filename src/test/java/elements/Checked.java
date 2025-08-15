package elements;

public enum Checked {
    UNCHECK("rct-icon-uncheck"),
    HALFCHECK("rct-icon-half-check"),
    CHECK("rct-icon-check");

    private final String cssClass;

    Checked(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssClass() {
        return cssClass;
    }
}
