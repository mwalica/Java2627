package model;

import java.util.concurrent.ThreadLocalRandom;

public class Person extends Object{
    private String name = "Jan";
    private int age = 21;

    public Person(String name) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt(18,99);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String showPerson() {
        return "Jestem " + name;
    }

    public void showPerson(boolean isAdult) {
        IO.println("Jestem " + name + " i " + (isAdult ? " pracuję " : " uczę się"));
    }

    public int showPerson(int param) {
        return age * param;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nage: " + age;
    }
}
