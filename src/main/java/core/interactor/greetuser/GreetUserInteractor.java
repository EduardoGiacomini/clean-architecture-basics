package core.interactor.greetuser;

import core.entity.user.User;
import core.protocol.Interactor;
import core.protocol.RequestModel;
import core.protocol.ResponseModel;

public class GreetUserInteractor implements Interactor {
    @Override
    public ResponseModel execute(RequestModel requestModel) {
        GreetUserRequestModel request = (GreetUserRequestModel) requestModel;
        User user = request.getUser();
        String greetingMessage = user.getLanguage().greet() + ", " + user.getName() + ".";
        return new GreetUserResponseModel(greetingMessage);
    }
}
