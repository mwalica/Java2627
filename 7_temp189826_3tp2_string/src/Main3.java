void main() {
    int age = 45;
    StringBuilder str = new StringBuilder("Nazywam się ");
    str.append("Jan").append(" i mam ").append(age).append(" lat");
    IO.println(str.toString().toUpperCase());
}