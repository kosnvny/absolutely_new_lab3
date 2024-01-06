package space;

import java.util.Objects;

public abstract class Space {
    private int length;
    private int width;
    private int height;

    public Space(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Space{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Space space = (Space) o;
        return length == space.length && width == space.width && height == space.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }
}
