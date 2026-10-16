package model;

import java.util.Random;

public class Person {
    //pola, atrybuty, właściwości
    private String name = "Jan";//domyślnie null
    private int age = 23;//domyślnie 0
    private boolean isAdult = true;//domyślnie false

    public Person() {};

    public Person(String name, int age, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
        IO.println("Obiekty klasy Person został utworzony");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAdult = age > 17;
    }

    public Person(String _name) {
        name = _name;
        age = new Random().nextInt() * 101;
        isAdult = age > 17;
    }

    //metody, funkcje
    public void showPerson() {
        IO.println("imię: " + name);
        IO.println("wiek: " + age);
        IO.println(isAdult ? "jest pełnoletni" : "nie jest pełnoletni");
    }

    public String presentation(String name) {
//Jestem Jan zwany Rumcajs
        String str = " zwany ";//zmienna lokalna
        return "Jestem " + this.name + str + name;
    }

    //gettery
    public String getName() {
        return name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }
}