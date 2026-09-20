void main() {
    //stała
    final int num1 = 54;
    //num1 = 67;
    //rzutowanie niejawne mniejszy do większego
    int num2 = 129;//4B
    long num3 = num2;//8B
    float num4 = num2;
    double num5 = num4;
    IO.println(num2);
    IO.println(num3);
    IO.println(num4);

    //rzutowanie jawne większy do mniejszego
    short num6 = (short) num2;
    IO.println(num6);
    byte num7 = (byte) num2;
    IO.println(num7);
    double num8 = 23.995456;
    int num9 = (int) num8;
    IO.println(num8);
    IO.println(num9);
}