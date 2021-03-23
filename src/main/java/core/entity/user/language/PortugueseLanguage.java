package core.entity.user.language;

public class PortugueseLanguage extends Language {
    public PortugueseLanguage() {
        super("Portuguese");
    }

    @Override
    public String greet() {
        return "Olá";
    }
}
