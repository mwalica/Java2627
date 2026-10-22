import model.Person;

void main() {
    Person person1 = new Person("Karol");
    Person person2 = new Person("Gustaw");

    person1.showPerson(true);
    person2.showPerson(false);
    IO.println(person1.toString());
    IO.println(person2.toString());
}