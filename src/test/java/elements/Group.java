package elements;

public enum Group {
    ELEMENTS("Elements", "elements"),
    FORMS("Forms", "forms"),
    ALERTSWINDOWS("Alerts, Frame & Windows", "alertsWindows"),
    WIDGETS("Widgets", "widgets"),
    INTERACTIONS("Interactions", "interaction"),
    BOOKS("Book Store Application", "books");


    private final String groupName;
    private final String endpoint;
    Group(String groupName, String endpoint) {
        this.groupName = groupName;
        this.endpoint = endpoint;
    }

    public String returnGroupName() {
        return groupName;
    }

    public String returnEndpoint() {
        return endpoint;
    }
}
