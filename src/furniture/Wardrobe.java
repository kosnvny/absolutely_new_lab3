package furniture;

import interfaces.Openable;

import java.util.Objects;

public class Wardrobe extends Furniture implements Openable {
    private boolean wasOpened;
    public Wardrobe(int height, String name, Material material, boolean wasOpened) {
        super(height, name, material);
        this.wasOpened = wasOpened;
    }
    @Override
    public boolean open() {
        System.out.println("Хмммм. А что со шкафом?");
        return !(wasOpened);
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "wasOpened=" + wasOpened +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wardrobe wardrobe = (Wardrobe) o;
        return wasOpened == wardrobe.wasOpened;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wasOpened);
    }
}
