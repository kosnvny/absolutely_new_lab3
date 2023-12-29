package furniture;

import interfaces.Appearable;
public class Shelf extends Furniture implements Appearable {
    private boolean wasAppeared;
    public Shelf(int height, String name, Material material, boolean wasAppeared) {
        super(height, name, material);
        this.wasAppeared = wasAppeared;
    }
    @Override
    public boolean appear() {
        System.out.println("Что же произойдёт с полкой?");
        return !(wasAppeared);
    }
}
