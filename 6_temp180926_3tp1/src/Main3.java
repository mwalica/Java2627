void main() {

  String name1 = "Jan";
  String name2 = "Jan";
  String name3 = new String("Karol");
  String name4 = new String("Karol");
  String name5 = null;
  name5 = name4;
  //porównywanie wartości
  int a = 7;
  int b = 8;
  IO.println(a == b);

  //porównywanie String
  IO.println(name1 == name2);
  IO.println(name3 == name4);
  IO.println(name1.equals(name1));
  IO.println(name3.equals(name4));
  IO.println(name3.equalsIgnoreCase(name4));

}