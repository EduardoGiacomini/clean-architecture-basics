package core.entity;

public class User {
    private final String name;
    private final String language;

    public User(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }
}
