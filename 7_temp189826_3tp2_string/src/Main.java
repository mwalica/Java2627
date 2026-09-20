void main() {
    int a = 23;
    byte b = 23;

    //porównywania wartości w typach prostych ==
    IO.println(a == b);
    //typ String
    String name1 = "Jan";
    String name2 = "Jan";
    String name3 = new String("Karol");
    String name4 = new String("Karol");
    String name5 = name4;
    String name6 = null;

    IO.println(name1 == name2);
    IO.println(name3 == name4);
    IO.println(name1.equals(name2));
    IO.println(name3.equals(name4));
    IO.println(name1.equals(name4));
}