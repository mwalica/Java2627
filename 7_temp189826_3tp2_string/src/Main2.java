void main() {
    var str = "Java to język programowania";

    IO.println(str);
    IO.println(str.trim());
    IO.println(str.toLowerCase());
    IO.println(str.toUpperCase());
    IO.println(str.length());
    IO.println(str.contains("j"));
    IO.println(str.contains("java"));
    IO.println(str.indexOf("x"));
    IO.println(str.lastIndexOf("a"));
    IO.println(str.concat(" ").repeat(2).toUpperCase());
    IO.println(str.replace("a", "x"));
    IO.println(str.substring(2));
    IO.println(str.substring(2, 6));
    IO.println(String.valueOf(235434));


}