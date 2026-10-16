public class Person {
//właściwosci pola
    String name = "Jan";//null
    int age = 23;//0
    boolean isActive = true;//false


    //metody

    String presentation() {
        return "Jestem "+ name + " i mam " + age + " lat";
    }
    //arkument funkcji to ksywa
    void showPerson(String name) {
        //zmienn loklna name
        //zmienna lokalna
        String str = " zwany ";
        IO.println("Jestem " + this.name + str + name);
    }


}
