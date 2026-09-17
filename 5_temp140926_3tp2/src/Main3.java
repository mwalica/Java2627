void main() {
    int a = 7;
    int b = 8;

    {
        int c = 23;
        a = 45;
        IO.println(a);
        IO.println(b);
        IO.println(c);
    }

    int c = 345345;
    IO.println(a);
    IO.println(b);
    //IO.println(c);
}