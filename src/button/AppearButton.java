package button;

import furniture.Chair;
import furniture.Furniture;
import furniture.Shelf;
import furniture.Table;
import interfaces.Appearable;
import person.Mood;
import person.Person;

import java.util.ArrayList;
import java.util.Objects;

public class AppearButton extends Button{
    private Furniture furniture;
    public AppearButton(Colour colour, Furniture furniture) {
        super(colour);
        this.furniture = furniture;
    }

    @Override
    public void act(ArrayList<Person> spectators) {
        Appearable furniture1 = (Appearable) furniture;
        if (furniture1.appear()) {
            System.out.println(furniture.getName() + " появились из стен.");
            for (Person p : spectators) {
                p.setMood(Mood.AMAZED);
            }
            System.out.println("Зрители" + Mood.AMAZED.getTr());
        } else {
            System.out.println("Столы уже были выдвинуты :((");
            for (Person p : spectators) {
                p.setMood(Mood.SAD);
            }
            System.out.println("Зрители " + Mood.SAD.getTr());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppearButton that = (AppearButton) o;
        return Objects.equals(furniture, that.furniture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(furniture);
    }

    @Override
    public String toString() {
        return "AppearButton{" +
                "furniture=" + furniture +
                '}';
    }
}
