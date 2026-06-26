public enum ETypeQuestion {
    ESSAY("Essay"),
    MULTIPLE_CHOICE("Multiple-Choice");

    private final String displayName;

    ETypeQuestion(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
    
}
