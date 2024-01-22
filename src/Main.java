import button.*;
import furniture.*;
import person.*;
import space.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Storeroom storeroom = new Storeroom(5, 5, 5, false);
        Chair chair = new Chair(10, "стулья", Material.WOOD, false);
        Shelf shelf = new Shelf(1, "полки", Material.GLASS, false);
        Table table = new Table(30, "столы", Material.PLASTIC, false);
        Wardrobe wardrobe = new Wardrobe(9, "шкаф", Material.WOOD, false);
        Hammock hammock = new Hammock(40, "гамак", Material.CLOTH);
        Shurupchik shurupchik = new Shurupchik(10, "Шурупчик", Mood.DEFAULT, Location.SCIENTISTS_ROOM, hammock);
        Person p1 = new Person(5, "Крош", Mood.AMAZED, Location.SCIENTISTS_ROOM);
        Person p2 = new Person(18, "Лев Алекс", Mood.TIRED, Location.SCIENTISTS_ROOM);
        Person p3 = new Person(10, "Винни-Пух", Mood.DEFAULT, Location.SCIENTISTS_ROOM);
        ArrayList<Person> spectators = new ArrayList<>();
        spectators.add(0, p1);
        spectators.add(1, p2);
        spectators.add(2, p3);
        AppearButton appearButton1 = new AppearButton(Colour.BLUE, chair);
        AppearButton appearButton2 = new AppearButton(Colour.GREEN, table);
        AppearButton appearButton3 = new AppearButton(Colour.RED, shelf);
        HammockButton hammockButton = new HammockButton(Colour.WHITE, hammock);
        OpenButton openButton1 = new OpenButton(Colour.ORANGE, wardrobe);
        OpenButton openButton2 = new OpenButton(Colour.BLACK, storeroom);
        shurupchik.push(hammockButton, spectators);
        shurupchik.push(appearButton1, spectators);
        shurupchik.push(appearButton2, spectators);
        shurupchik.push(appearButton3, spectators);
        shurupchik.push(openButton1, spectators);
        shurupchik.push(openButton2, spectators);
        shurupchik.move(Location.BASEMENT);
    }
}
