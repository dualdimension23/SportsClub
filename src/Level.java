import java.util.ArrayList;

public enum Level {
    BEGINNER("Anfänger"),
    NORMAL("Normal"),
    ADVANCED("Fortgeschritten"),
    PROFESSIONAL("Profi");

    String mappedName;
    private static final Level[] values = values();

    Level(String s) {
        if (!checkForValidValues(s)) {
            throw new RuntimeException("String not found!");
        } else {
            mappedName = s;
        }
    }

    boolean checkForValidValues(String s) {
        ArrayList<String> allowedNames = new ArrayList<String>();
        allowedNames.add("Anfänger");
        allowedNames.add("Normal");
        allowedNames.add("Fortgeschritten");
        allowedNames.add("Profi");
        return allowedNames.contains(s);
    }

    public Level next() {
        return values[(this.ordinal() + 1) % values.length];
    }

    @Override
    public String toString() {
        return mappedName;
    }
}
