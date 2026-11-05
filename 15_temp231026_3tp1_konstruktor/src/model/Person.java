package model;

import java.util.Random;

public class Person {

    public String name = "Jan";
    public int age = 23;
    public boolean isAdult = true;

    public Person() {};

    public Person(String name, int age, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
        IO.println("Obiekt został utworzony");
    }

    public Person(String name) {
        this.name = name;
        this.age = new Random().nextInt(100) + 1;
        this.isAdult = age > 17;
    }

    public void presentation() {
        IO.println("Jestem " + name + " i mam " + age + " lat\nJestem " + (isAdult ? " dorosły" : "dzieckiem"));
    }
}
