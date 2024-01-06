package furniture;

import interfaces.Appearable;

import java.util.Objects;

public class Chair extends Furniture implements Appearable{
    private boolean wasAppeared;
    public Chair(int height, String name, Material material, boolean wasAppeared) {
        super(height, name, material);
        this.wasAppeared = wasAppeared;
    }
    @Override
    public boolean appear() {
        System.out.println("Что же произойдёт со стулом?");
        return !(wasAppeared);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "wasAppeared=" + wasAppeared +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return wasAppeared == chair.wasAppeared;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wasAppeared);
    }
}
