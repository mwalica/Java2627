void main() {
    //rzutowanie niejawne mniejszy do wiekszego
    int num1 = 129;//4B
    long num2 = num1;
    IO.println(num1);
    IO.println(num2);
    float num3 = 1.934563453453453F;
    double num4 = num3;
    IO.println(num3);
    IO.println(num4);

    //rzutowanie jawne wiekszy do mniejszego
    short num5 = (short) num1;
    IO.println(num5);
    byte num6 = (byte) num1;
    IO.println(num6);
    int num7 = (int) num4;
    IO.println(num7);
}