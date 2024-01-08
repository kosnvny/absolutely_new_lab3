package person;

public enum Location {
    SCIENTISTS_ROOM("комната учёного"), BASEMENT("подполье");
    private String tr;

    Location(String tr) {
        this.tr = tr;
    }
}
