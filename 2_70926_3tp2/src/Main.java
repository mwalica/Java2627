/**
Mój pierwszy program
 2026-09-07
 */

//metoda aplikacji
void main() {
    IO.print("To jest początek programu\n");
    IO.println("Hello\s\sJava");
    IO.println("Hello\t\tJava");
    IO.println("=".repeat(23));
    greet();
    IO.println(userAge("Jan", 45));
    IO.println("Koniec programu");
}

void greet() {
    IO.println("Witam serdecznie");
}

String userAge(String name, int age) {
    return "Nazywam się " + name + " i mam " + age + " lat";
}