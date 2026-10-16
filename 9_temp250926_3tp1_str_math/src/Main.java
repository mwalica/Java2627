void main() {
    var name = "Jan";
    var age = 23;

    IO.println("Jestem " + name + " i mam " + age + " lat.");
    IO.println("" + 23 + 90 + "Jestem " + name + " i mam " + (age + 10) + " lat.");

    String str1 = "Nazywam się ";
    String str2 = str1.concat(name).concat(" i mam ").concat(String.valueOf(age)).concat(" lat").concat(String.valueOf('.'));
    IO.println(str2);
}