package core.entity.user.language;

public class EnglishLanguage extends Language {
    public EnglishLanguage() {
        super("English");
    }

    @Override
    public String greet() {
        return "Hi";
    }
}
