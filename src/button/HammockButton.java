package button;

import furniture.Hammock;
import person.Mood;
import person.Person;

import java.util.ArrayList;
import java.util.Objects;

public class HammockButton extends Button{
    public Hammock hammock;
    public HammockButton(Colour colour, Hammock hammock) {
        super(colour);
        this.hammock = hammock;
    }

    @Override
    public void act(ArrayList<Person> spectators) {
        for(Person p : spectators) {
            p.setMood(Mood.ASTONISHED);
        }
        System.out.println("Зрители " + Mood.ASTONISHED.getTr());
    }

    @Override
    public String toString() {
        return "HammockButton{" +
                "hammock=" + hammock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HammockButton that = (HammockButton) o;
        return Objects.equals(hammock, that.hammock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hammock);
    }
}
