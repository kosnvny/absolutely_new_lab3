package person;

import button.AppearButton;
import button.Button;
import button.HammockButton;
import button.OpenButton;
import interfaces.IMove;
import space.Space;

import java.util.ArrayList;

public class Shurupchik extends Person implements IMove {
    public Shurupchik(int age, String name, Mood mood, Space space) {
        super(age, name, mood, space);
    }
    public void push(Button button, ArrayList<Person> spectators) {
        if (button instanceof HammockButton) {
            HammockButton b = (HammockButton) button;
            b.act(spectators);
        }
        if (button instanceof AppearButton) {
            AppearButton b = (AppearButton) button;
            b.act(spectators);
        }
        if (button instanceof OpenButton) {
            OpenButton b = (OpenButton) button;
            b.act(spectators);
        }
    }
    @Override
    public void move(Space spaceY) {
        setSpace(spaceY);
        System.out.println(getName() + " оказался в подвале.");
    }
}
