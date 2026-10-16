void main() {
    //losowanie liczby
    //losowanie od <0, 1)
    double randomNum1 = Math.random();
    double randomNum2 = Math.random() * 100;
    int randomNum3 = (int) Math.round(Math.random() * 100);
    double floor = Math.floor(randomNum2);
    double ceil = Math.ceil(randomNum2);

    IO.println(randomNum1);
    IO.println(randomNum2);
    IO.println(randomNum3);
    IO.println(floor);
    IO.println(ceil);

    //obiekt klasy Random
    Random random = new Random();
    boolean bool = random.nextBoolean();
    //losowanie wartości logicznej
    IO.println(bool);
    //losowanie liczby całkowitej
    int ran1 = random.nextInt();
    IO.println(ran1);
    //losowanie od 0 do 99
    int ran2 = random.nextInt(100);
    IO.println(ran2);
    //od -10 do 10
    int ran3 = random.nextInt(21) - 10;
    int ran4 = random.nextInt(-10, 10);
    IO.println(ran4);
    IO.println(Math.clamp(ran4, -5, 5));

}