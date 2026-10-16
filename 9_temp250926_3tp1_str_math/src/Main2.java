void main() {
    StringBuilder str = new StringBuilder("Nazywam się ");
    String name = "Jan";
    int age = 23;
    str.append(name).append(" i mam ").append(age).append(" lat.");
    IO.println(str);
}