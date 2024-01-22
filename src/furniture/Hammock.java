package furniture;

import person.Person;

import java.util.Objects;

public class Hammock extends Furniture{
    private Person p;
    public Hammock(int height, String name, Material material) {
        super(height, name, material);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hammock hammock = (Hammock) o;
        return Objects.equals(p, hammock.p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), p);
    }

    @Override
    public String toString() {
        return "Hammock{" +
                "p=" + p +
                '}';
    }
}
