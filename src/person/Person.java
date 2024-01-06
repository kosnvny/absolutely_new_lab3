package person;

import space.Space;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private Mood mood;
    private Space space;

    public Person(int age, String name, Mood mood, Space space) {
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
    public void setSpace(Space space) {
        this.space = space;
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
