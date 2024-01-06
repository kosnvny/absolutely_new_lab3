package furniture;

import interfaces.Appearable;

import java.util.Objects;

public class Shelf extends Furniture implements Appearable {
    private boolean wasAppeared;
    public Shelf(int height, String name, Material material, boolean wasAppeared) {
        super(height, name, material);
        this.wasAppeared = wasAppeared;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "wasAppeared=" + wasAppeared +
                '}';
    }

    @Override
    public boolean appear() {
        System.out.println("Что же произойдёт с полкой?");
        return !(wasAppeared);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shelf shelf = (Shelf) o;
        return wasAppeared == shelf.wasAppeared;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wasAppeared);
    }
}
