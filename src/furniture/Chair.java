package furniture;

import interfaces.Appearable;
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
}
