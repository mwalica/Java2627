package model;

public class Person {
    //właściwości, pola
    public String name = "Karol";//domyślnie null
    public int age = 32;//domyślnie 0
    public boolean isAdult = true;//domyślnie false


    //metody, funkcje
    public String presentation() {
        return "Jestem " + this.name + " i mam " + age + " lat\n" +
                "Jestem " + (isAdult ? "dorosłym" : "dzieckiem");
    }

    public void showPerson(String name) {
        //zmienna lokalna
        String str = " zwany ";
        IO.println("Jestem " + this.name + " " + str + " " + name);
    }
}
