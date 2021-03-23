package core.interactor.greetuser;

import core.protocol.RequestModel;

public class GreetUserRequestModel implements RequestModel {
    private final String userName;

    public GreetUserRequestModel(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }
}
