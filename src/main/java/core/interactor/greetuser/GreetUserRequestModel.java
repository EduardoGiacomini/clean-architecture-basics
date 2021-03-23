package core.interactor.greetuser;

import core.entity.user.User;
import core.protocol.RequestModel;

public class GreetUserRequestModel implements RequestModel {
    private final User user;

    public GreetUserRequestModel(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}
