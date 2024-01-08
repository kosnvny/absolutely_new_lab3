package person;

import button.Button;
import space.Space;
import java.util.ArrayList;

public class Shurupchik extends Person {
    public Shurupchik(int age, String name, Mood mood, Location space) {
        super(age, name, mood, space);
    }
    public void push(Button button, ArrayList<Person> spectators) {
        button.act(spectators);
    }
}
