package constants.webtables;

public enum RowOption {

    FIVE_ROWS(0),
    TEN_ROWS(1),
    TWENTY_ROWS(2),
    TWENTYFIVE_ROWS(3),
    FIFTY_ROWS(4),
    HUNDRED_ROWS(5);

    private final int index;

    RowOption(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
