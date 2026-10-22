import model.Person;

void main() {
    Person person1 = new Person();
    Person person2 = new Person();

    IO.println(person1.name);
    IO.println(person1.age);
    IO.println(person1.isAdult);
    IO.println(person1.presentation());
    person1.showPerson("wielki");

    person2.name = "Gustaw";
    IO.println(person2.name);
    IO.println(person2.age);
    IO.println(person2.isAdult);
    IO.println(person2.presentation());
    person1.showPerson("Łysy");
}