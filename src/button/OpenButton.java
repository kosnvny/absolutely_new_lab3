package button;

import furniture.Wardrobe;
import interfaces.Openable;
import person.Mood;
import person.Person;
import space.Storeroom;

import java.util.ArrayList;
import java.util.Objects;

public class OpenButton extends Button{
    private Storeroom storeroom;
    private Wardrobe wardrobe;
    public OpenButton(Colour colour, Storeroom storeroom) {
        super(colour);
        this.storeroom = storeroom;
    }
    public OpenButton(Colour colour, Wardrobe wardrobe) {
        super(colour);
        this.wardrobe = wardrobe;
    }

    @Override
    public void act(ArrayList<Person> spectators) {
        Openable thing = (storeroom != null ? storeroom : wardrobe);
        if (thing.open()) {
            System.out.println("Всё открылось!");
            for (Person p : spectators) {
                p.setMood(Mood.HAPPY);
            }
            System.out.println("Зрители " + Mood.HAPPY.getTr());
        } else {
            System.out.println(" уже открыто :(");
            for (Person p : spectators) {
                p.setMood(Mood.SAD);
            }
            System.out.println("Зрители " + Mood.SAD.getTr());
        }
    }

    @Override
    public String toString() {
        return "OpenButton{" +
                "storeroom=" + storeroom +
                ", wardrobe=" + wardrobe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OpenButton that = (OpenButton) o;
        return Objects.equals(storeroom, that.storeroom) && Objects.equals(wardrobe, that.wardrobe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), storeroom, wardrobe);
    }
}
