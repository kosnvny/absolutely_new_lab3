package button;

import person.Person;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Button {
    private Colour colour;
    public Button(Colour colour) {
        this.colour = colour;
    }

    public abstract void act(ArrayList<Person> spectators);
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Button button = (Button) o;
        return colour == button.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour);
    }

    @Override
    public String toString() {
        return "Button{" +
                "colour=" + colour +
                '}';
    }
}
