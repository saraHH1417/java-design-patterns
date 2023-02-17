package src.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorConcrete implements ChatMediator{
    private List<User> users;

    public ChatMediatorConcrete() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u: this.users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
