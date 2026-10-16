import model.*;

void main() {
    Person person1 = new Person("Karol", 34, true);
    Person person2 = new Person("Andrzej", 17);
    Person person3 = new Person("Gustaw");

    person1.showPerson();
    person2.showPerson();

    IO.println(person1.getAge());
    IO.println(person1.getName());
    IO.println(person1.isAdult());
}