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
        RequestModel request = new GreetUserRequestModel("Carlos Eduardo Dias Giacomini");
        GreetUserResponseModel response = (GreetUserResponseModel) interactor.execute(request);
        Assert.assertEquals("Olá Carlos Eduardo Dias Giacomini", response.getMessage());
    }
}
