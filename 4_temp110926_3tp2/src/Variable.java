void main() {
    //deklaracja zmienne
    String name1;
    int number1;
    int num1, num2, num3;
    //inicjalizacja zmiennej
    name1 = "Jan";
    number1 = 34;
    num1 = 2;
    num2 = 5;
    num3 = 7;
    //deklaracja inicjalizacja
    String car = "Fiat";
    var num4 = 34;
    String color1 = "red", color2 = "blue";

    car = "Ford";
    //stałe
    final double RATE = 1.23;

    //typy proste
    //liczby całkowite
    //byte 1B 8b
    byte num10 = 127;
    IO.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
    //short 2B 16b
    short num11 = 11321;
    IO.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
    //int 4B 32b
    int num12 = 1_234_234_234;
    IO.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
    //long 8B 64b
    long num13 = 2147483425345L;
    IO.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
    int numB = 0b101001;
    int numO = 01123312;
    long numH = 0x12faaabbbL;
    //liczba zmiennoprzecinkowa
    //4B float
    //8B double****
    float num14 = 1.2344534534534534F;
    double num15 = 1.2344534534534534;
    IO.println("float = " + num14);
    IO.println("double = " + num15);
    IO.println(1.22 - 1.21);

    //typ znak char
    char letter_a = 'a';
    char num_a = 97;
    IO.println(letter_a == 97);
    //typ boolean
    boolean bool1 = true;
    boolean bool2 = 34 < 11;

}