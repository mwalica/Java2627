void main() {


    IO.print("Początek programu\n");
    IO.println("Hello\s\sJava");
    IO.println("Hello\t\tJava");
    IO.println("=".repeat(20));
    greet();
    IO.println(userAge("Jan", 45));
    IO.println("Koniec");
}


void greet() {
    IO.println("Hello from function");
}

String userAge(String name, int age) {
    return "Jestem " + name + " i mam " + age + " lat.";
}