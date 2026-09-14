void main() {
    //deklaracja zmiennej
    String name;
    int num1, num2, num3;
    //incjalizacja zmiennej
    name = "Jan";
    num1 = 34;
    num2 = 35;
    num3 = 11;
    //deklaracja i inicjalizacja
    String car1 = "Fiat";
    int num4 = 20, num5 = 45;
    car1 = "Ford";
    var name2 = "Jola";
    //type proste
    //typ liczba całkowitych
    //byte 1B 8b
    byte num10 = 127;
    IO.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
    //short 2B 16b
    short num11 = 12312;
    IO.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
    //int 4B 32b
    int num12 = 2_121_312_312;
    IO.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
    //long 8B 64b
    long num13 = 214_748_364_843_534L;
    IO.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
    int numB = 0b10101;
    int numO = 0123123;
    int numH = 0x12312AB;
    //typ liczba zmiennoprzecinkowa
    //float 4B 32b
    float num14 = 1.2243534534534534636F;
    //double 8B 64b
    double num15 = 1.2243534534534534636;
    IO.println("float = " + num14);
    IO.println("double = " + num15);
    IO.println(1.23 - 1.22);
    //char 2B 16b
    char letter_a = 'a';
    char un = 97;
    IO.println(letter_a == un);
    //boolean
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = 23 > 11;

}