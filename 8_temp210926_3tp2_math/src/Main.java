void main() {

    String str1 = "";

//    for(int i = 0; i < 100_000; i++) {
//        str1 += i + " ";
//    }
//
//    IO.println(str1);

    StringBuilder str2 = new StringBuilder();
    for(int i = 0; i < 100_000; i++) {
        str2.append(i).append(" ");
    }

    IO.println(str2);
}