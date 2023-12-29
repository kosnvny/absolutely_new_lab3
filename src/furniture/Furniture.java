package furniture;

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
}
