package button;

import furniture.Hammock;
import person.Mood;
import person.Person;

import java.util.ArrayList;

public class HammockButton extends Button{
    public Hammock hammock;
    public HammockButton(Colour colour, Hammock hammock) {
        super(colour);
        this.hammock = hammock;
    }
    public void act(ArrayList<Person> spectators) {
        System.out.println("Шурупчик нажал кнопку.");
        hammock.lower();
        for(Person p : spectators) {
            p.setMood(Mood.ASTONISHED);
        }
        System.out.println("Зрители " + Mood.ASTONISHED.getTr());
    }
}
