package space;

import interfaces.Openable;

import java.util.Objects;

public class Storeroom extends Space implements Openable {
    private boolean wasOpened;

    public Storeroom(int length, int width, int height, boolean wasOpened) {
        super(length, width, height);
        this.wasOpened = wasOpened;
    }

    @Override
    public boolean open() {
        System.out.println("Хмммм. А что со кладовой?");
        return !(wasOpened);
    }

    @Override
    public String toString() {
        return "Storeroom{" +
                "wasOpened=" + wasOpened +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storeroom storeroom = (Storeroom) o;
        return wasOpened == storeroom.wasOpened;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wasOpened);
    }
}
