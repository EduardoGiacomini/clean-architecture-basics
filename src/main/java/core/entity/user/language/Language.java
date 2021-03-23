package core.entity.user.language;

public abstract class Language {
    private final String language;

    public Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public abstract String greet();
}
