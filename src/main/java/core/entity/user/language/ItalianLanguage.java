package core.entity.user.language;

public class ItalianLanguage extends Language {
    public ItalianLanguage() {
        super("Italian");
    }

    @Override
    public String greet() {
        return "Ciao";
    }
}
