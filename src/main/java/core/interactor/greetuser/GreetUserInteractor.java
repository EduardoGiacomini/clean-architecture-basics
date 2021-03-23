package core.interactor.greetuser;

import core.protocol.Interactor;
import core.protocol.RequestModel;
import core.protocol.ResponseModel;

public class GreetUserInteractor implements Interactor {
    @Override
    public ResponseModel execute(RequestModel requestModel) {
        GreetUserRequestModel request = (GreetUserRequestModel) requestModel;
        String greetingMessage = "Olá " + request.getUserName();
        GreetUserResponseModel response = new GreetUserResponseModel(greetingMessage);
        return response;
    }
}
