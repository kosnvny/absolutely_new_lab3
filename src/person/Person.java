package person;

import interfaces.Moveable;
import space.Space;

import java.util.Objects;

public class Person implements Moveable {
    private int age;
    private String name;
    private Mood mood;
    private Location space;

    public Person(int age, String name, Mood mood, Location space) {
        this.age = age;
        this.name = name;
        this.mood = mood;
        this.space = space;
    }

    public String getName() {
        return name;
    }
    public Mood getMood() {
        return mood;
    }
    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public void setSpace(Location space) {
        this.space = space;
    }

    @Override
    public void move(Location spaceY) {
        setSpace(spaceY);
        System.out.println(getName() + " оказался в другой комнате.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", mood=" + mood +
                ", space=" + space +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && mood == person.mood && Objects.equals(space, person.space);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, mood, space);
    }
}
