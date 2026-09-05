void main() {
  IO.print("To jest początek programu\n");
  IO.println("Hello\s\sJava");
  IO.println("Hello\t\t Java");
  IO.println("=".repeat(22));
  greet();
  IO.println(userAge("Jan", 24));
  IO.println("Koniec programu");
}

void greet() {
  IO.println("Hello z funkcji greet");
}

String userAge(String name, int age) {
  return "Nazywam się " + name + " i mam " + age + " lat";
}