package core.interactor.greetuser;

import core.protocol.ResponseModel;

public class GreetUserResponseModel implements ResponseModel {
    private final String message;

    public GreetUserResponseModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
