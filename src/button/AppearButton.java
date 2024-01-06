package button;

import furniture.Chair;
import furniture.Furniture;
import furniture.Shelf;
import furniture.Table;
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
        System.out.println("Шурупчик нажал кнопку.");
        if (furniture instanceof Table) {
            Table f = (Table) furniture;
            if (f.appear()) {
                System.out.println("Столы появились из стен.");
                for (Person p: spectators) {
                    p.setMood(Mood.AMAZED);
                }
                System.out.println("Зрители" + Mood.AMAZED.getTr());
            } else {
                System.out.println("Столы уже были выдвинуты :((");
                for (Person p: spectators) {
                    p.setMood(Mood.SAD);
                }
                System.out.println("Зрители " + Mood.SAD.getTr());
            }
        } else if (furniture instanceof Chair) {
            Chair f = (Chair) furniture;
            if (f.appear()) {
                System.out.println("Стулья появились из пола.");
                for (Person p: spectators) {
                    p.setMood(Mood.AMAZED);
                }
                System.out.println("Зрители " + Mood.AMAZED.getTr());
            } else {
                System.out.println("Стулья уже стояли :((");
                for (Person p: spectators) {
                    p.setMood(Mood.SAD);
                }
                System.out.println("Зрители" + Mood.SAD.getTr());
            }
        } else if (furniture instanceof Shelf) {
            Shelf f = (Shelf) furniture;
            if (f.appear()) {
                System.out.println("Полки появились из стен.");
                for (Person p: spectators) {
                    p.setMood(Mood.AMAZED);
                }
                System.out.println("Зрители " + Mood.AMAZED.getTr());
            } else {
                System.out.println("Полки уже были прибиты к стене :((");
                for (Person p: spectators) {
                    p.setMood(Mood.SAD);
                }
                System.out.println("Зрители" + Mood.SAD.getTr());
            }
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
