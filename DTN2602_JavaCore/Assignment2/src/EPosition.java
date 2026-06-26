public enum EPosition {
    DEV("Dev"),
    TEST("Test"),
    SCRUM_MASTER("Scrum Master"),
    PM("PM");

    private final String displayName;

    EPosition(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}