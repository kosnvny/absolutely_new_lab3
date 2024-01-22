package person;

import button.Button;
import button.HammockButton;
import furniture.Hammock;
import space.Space;
import java.util.ArrayList;

public class Shurupchik extends Person {
    public Hammock hammock;

    public Shurupchik(int age, String name, Mood mood, Location space, Hammock hammock) {
        super(age, name, mood, space);
        this.hammock = hammock;
    }
    public void push(Button button, ArrayList<Person> spectators) {
        System.out.println("Шурупчик нажал кнопку.");
        if (button instanceof HammockButton) {
            lower(hammock);
        }
        button.act(spectators);
    }
}
