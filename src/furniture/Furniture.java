package furniture;

import java.util.Objects;

public abstract class Furniture {
    private int height;
    private String name;
    private Material material;
    public Furniture(int height, String name, Material material) {
        this.height = height;
        this.name = name;
        this.material = material;
    }
    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return height == furniture.height && Objects.equals(name, furniture.name) && material == furniture.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, name, material);
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", material=" + material +
                '}';
    }
}
