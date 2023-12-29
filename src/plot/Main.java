package plot;

import button.*;
import furniture.*;
import person.*;
import space.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ScientistsRoom room = new ScientistsRoom(10, 10, 10);
        Storeroom storeroom = new Storeroom(5, 5, 5, false);
        Basement basement = new Basement(5, 5, 5);
        Shurupchik shurupchik = new Shurupchik(10, "Шурупчик", Mood.DEFAULT, room);
        Person p1 = new Person(5, "Крош", Mood.AMAZED, room);
        Person p2 = new Person(18, "Лев Алекс", Mood.TIRED, room);
        Person p3 = new Person(10, "", Mood.DEFAULT, room);
        ArrayList<Person> spectators = new ArrayList<>();
        spectators.add(0, p1);
        spectators.add(1, p2);
        spectators.add(2, p3);
        Chair chair = new Chair(10,"", Material.WOOD, false);
        Hammock hammock = new Hammock(40, "", Material.CLOTH);
        Shelf shelf = new Shelf(1, "", Material.GLASS, false);
        Table table = new Table(30, "", Material.PLASTIC, false);
        Wardrobe wardrobe = new Wardrobe(9, "", Material.WOOD, false);
        AppearButton appearButton1 = new AppearButton(Colour.BLUE, chair);
        AppearButton appearButton2 = new AppearButton(Colour.GREEN, table);
        AppearButton appearButton3 = new AppearButton(Colour.RED, shelf);
        HammockButton hammockButton = new HammockButton(Colour.WHITE, hammock);
        OpenButton openButton1 = new OpenButton(Colour.ORANGE, wardrobe);
        OpenButton openButton2 = new OpenButton(Colour.BLACK, storeroom);
        hammock.humanInHammock(p1);
        shurupchik.push(hammockButton, spectators);
        shurupchik.push(appearButton1, spectators);
        shurupchik.push(appearButton2, spectators);
        shurupchik.push(appearButton3, spectators);
        shurupchik.push(openButton1, spectators);
        shurupchik.push(openButton2, spectators);
        shurupchik.move(basement);
    }
}
