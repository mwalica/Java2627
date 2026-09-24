void main() {
IO.println(Math.PI);
//losowanie liczby
    double random1 = Math.random() * 100;
    int randomNumber1 = Math.toIntExact(Math.round(random1));
    double ceil = Math.ceil(random1);
    int floor = (int) Math.floor(random1);
    IO.println(random1);
    IO.println(randomNumber1);
    IO.println(ceil);
    IO.println(floor);

    //obiekt klasy Random
    Random random = new Random();
    boolean bool = random.nextBoolean();
    IO.println(bool);
    int randomNumber2 = random.nextInt();
    int randomNumber3 = random.nextInt(100);
    int randomNumber4 = random.nextInt(-100, 100);
    IO.println(randomNumber2);
    IO.println(randomNumber3);
    IO.println(randomNumber4);
    IO.println(Math.clamp(randomNumber4, -50, 50));
}