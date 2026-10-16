void main() {
    var str = "Java to język programowania";

    IO.println(str);
    IO.println(str.trim());
    IO.println(str.length());
    IO.println(str.concat("!!!"));
    IO.println(str.toLowerCase());
    IO.println(str.toUpperCase());
    IO.println(str.contains("x"));
    IO.println(str.contains("Java"));
    IO.println(str.indexOf("a"));
    IO.println(str.lastIndexOf("a"));
    IO.println(str.charAt(str.length()-1));
    IO.println(str.replace("a", "x"));
    IO.println(str.replace("Java", "PHP"));
    IO.println(str.substring(4));
    IO.println(str.substring(8, 10));
}