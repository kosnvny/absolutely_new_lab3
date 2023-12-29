package person;

import space.Space;

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
}
