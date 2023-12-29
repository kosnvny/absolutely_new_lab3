package furniture;

import interfaces.Appearable;
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

}
