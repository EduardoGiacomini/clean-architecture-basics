import core.entity.User;
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
        User user = new User("Carlos", "English");
        RequestModel request = new GreetUserRequestModel(user);
        GreetUserResponseModel response = (GreetUserResponseModel) interactor.execute(request);
        Assert.assertEquals("Hi Carlos", response.getMessage());
    }
}
