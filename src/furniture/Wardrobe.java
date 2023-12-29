package furniture;

import interfaces.Openable;
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
}
