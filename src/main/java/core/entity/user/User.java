package core.entity.user;

import core.entity.user.language.Language;

public class User {
    private final String name;
    private final Language language;

    public User(String name, Language language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public Language getLanguage() {
        return language;
    }
}
