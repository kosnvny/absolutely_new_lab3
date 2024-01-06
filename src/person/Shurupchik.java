package person;

import button.AppearButton;
import button.Button;
import button.HammockButton;
import button.OpenButton;
import space.Space;
import interfaces.Moveable;

import java.util.ArrayList;

public class Shurupchik extends Person implements Moveable {
    public Shurupchik(int age, String name, Mood mood, Space space) {
        super(age, name, mood, space);
    }
    public void push(Button button, ArrayList<Person> spectators) {
        button.act(spectators);
    }
    @Override
    public void move(Space spaceY) {
        setSpace(spaceY);
        System.out.println(getName() + " оказался в подвале.");
    }
}
