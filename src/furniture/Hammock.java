package furniture;

import person.Person;

public class Hammock extends Furniture{
    private Person p;
    public Hammock(int height, String name, Material material) {
        super(height, name, material);
    }
    public void humanInHammock(Person p) {
        this.p = p;
    }
    public void lower() {
        int h = getHeight();
        while (h > 0) {
            h -= 10;
        }
        System.out.println(p.getName() + " улёгся в гамаке на полу.");
    }
}
