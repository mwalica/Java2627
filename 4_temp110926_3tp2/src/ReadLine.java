void main() {
    IO.println("Wpisz imię: ");
    String name = IO.readln();

    String age = IO.readln("ILe masz lat? ");

    IO.println("Nazywam się " + name + " i mam " + age + " lat");

    String numA = IO.readln("Liczba a: ");
    String numB = IO.readln("Liczba b: ");

    int a = Integer.parseInt(numA);
    int b = Integer.parseInt(numB);

    IO.println("a + b = " + (a + b));
}