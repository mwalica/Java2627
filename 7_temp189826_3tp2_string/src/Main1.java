void main() {
  var name = "Jan";
  var age = 23;
  IO.println("Nazywam się " + name + " i mam " + age + " lat");
  IO.println("" + 23 + 56 + " Nazywam się " + name + " i mam " + (age + 34) + " lat");

  String str = "Nazywam się ".concat(name).concat(" i mam ").concat(""+age).concat(" lat");
  IO.println(str);

}