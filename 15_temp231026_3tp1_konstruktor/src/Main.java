import model.Person;

void main() {
    Person person1 = new Person("Adam", 26, true);
    Person person2 = new Person("Zuzanna", 17, false);
    Person person3 = new Person();
    Person person4 = new Person("Justyna");

    person1.presentation();
    person2.presentation();
    person3.presentation();
    person4.presentation();
}