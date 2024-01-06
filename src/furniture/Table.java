package furniture;

import interfaces.Appearable;

import java.util.Objects;

public class Table extends Furniture implements Appearable {
    private boolean wasAppeared;
    public Table(int height, String name, Material material, boolean wasAppeared) {
        super(height, name, material);
        this.wasAppeared = wasAppeared;
    }
    @Override
    public boolean appear() {
        System.out.println("Что же произойдёт со столом?");
        return !(wasAppeared);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Table table = (Table) o;
        return wasAppeared == table.wasAppeared;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wasAppeared);
    }

    @Override
    public String toString() {
        return "Table{" +
                "wasAppeared=" + wasAppeared +
                '}';
    }
}
