package constants;

public enum State {
    EXPANDED ("rct-node-expanded"),
    COLLAPSED ("rct-node-collapsed");

    private final String cssClass;

    State(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssClass() {
        return cssClass;
    }
}
