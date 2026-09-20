void main() {
    int a = 7;
    int b = 8;

    IO.println("a befor = " + a);
    IO.println("b befor = " + b);

    {
        int c = 19;
        a = 45;
        IO.println("a in = " + a);
        IO.println("b in = " + b);
        IO.println("c in = " + c);
    }

    int c = 34543;

    IO.println("a out = " + a);
    IO.println("b out = " + b);
    //IO.println("c out = " + c);
}