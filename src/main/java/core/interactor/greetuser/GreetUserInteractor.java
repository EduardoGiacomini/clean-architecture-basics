package core.interactor.greetuser;

import core.entity.User;
import core.protocol.Interactor;
import core.protocol.RequestModel;
import core.protocol.ResponseModel;

public class GreetUserInteractor implements Interactor {
    @Override
    public ResponseModel execute(RequestModel requestModel) {
        GreetUserRequestModel request = (GreetUserRequestModel) requestModel;
        User user = request.getUser();
        String greetingMessage = null;

        // FIXME: o código abaixo não está de acordo com o SRP (Single Responsability Principle).
        if (user.getLanguage().equals("Portuguese")) {
            greetingMessage = "Olá " + user.getName();
        } else if (user.getLanguage().equals("English")) {
            greetingMessage = "Hi " + user.getName();
        } else if (user.getLanguage().equals("Italian")) {
            greetingMessage = "Ciao " + user.getName();
        }

        GreetUserResponseModel response = new GreetUserResponseModel(greetingMessage);
        return response;
    }
}
