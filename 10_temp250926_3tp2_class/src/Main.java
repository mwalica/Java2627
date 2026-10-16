void main() {
    String name = new String("Jan");
    Person person1= new Person();
    Person person2= new Person();

    //IO.println(name);
    IO.println(person1.name);
    IO.println(person1.age);
    IO.println(person1.isActive);
    person2.name = "Karol";
    person2.age = 68;
    person2.isActive = false;
    IO.println(person2.name);
    IO.println(person2.age);
    IO.println(person2.isActive);

    IO.println(person1.presentation());
    IO.println(person2.presentation());
    person1.showPerson("gruby");
    person2.showPerson("stary");
}