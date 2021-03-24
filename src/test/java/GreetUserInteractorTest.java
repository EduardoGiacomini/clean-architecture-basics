import core.entity.user.User;
import core.entity.user.language.EnglishLanguage;
import core.entity.user.language.ItalianLanguage;
import core.entity.user.language.PortugueseLanguage;
import core.interactor.greetuser.GreetUserInteractor;
import core.interactor.greetuser.GreetUserRequestModel;
import core.interactor.greetuser.GreetUserResponseModel;
import core.protocol.Interactor;
import core.protocol.RequestModel;
import org.junit.Test;
import org.junit.Assert;

public class GreetUserInteractorTest {
    @Test
    public void test_shouldGreetUser() {
        Interactor interactor = new GreetUserInteractor();

        User user = new User("Carlos", new PortugueseLanguage());
        RequestModel request = new GreetUserRequestModel(user);
        GreetUserResponseModel response = (GreetUserResponseModel) interactor.execute(request);
        Assert.assertEquals("Olá, Carlos.", response.getMessage());

        user = new User("Eduard", new EnglishLanguage());
        request = new GreetUserRequestModel(user);
        response = (GreetUserResponseModel) interactor.execute(request);
        Assert.assertEquals("Hi, Eduard.", response.getMessage());

        user = new User("Giacomini", new ItalianLanguage());
        request = new GreetUserRequestModel(user);
        response = (GreetUserResponseModel) interactor.execute(request);
        Assert.assertEquals("Ciao, Giacomini.", response.getMessage());
    }
}
