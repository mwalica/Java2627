void main() {
    IO.println("Wpisz imię: ");
    String name = IO.readln();

    String age = IO.readln("Ile masz ? ");

    IO.println("Mam na imię " + name + " i mam " + age + " lat");

    String numA = IO.readln("Liczba a = ");
    String numB = IO.readln("Liczba b = ");
    int a = Integer.parseInt(numA);
    int b = Integer.parseInt(numB);

    IO.println("a + b = " + (a + b));

}