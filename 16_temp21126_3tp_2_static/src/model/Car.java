package model;

public class Car {

    public static final String SERIAL_NUMBER = "kjsfdhjkshdkfj246239";
    public String name;
    public int productionYear;
    public static int numberOfCars = 0;

    public Car(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
        Car.numberOfCars++;
    }

    public void showCar() {
        IO.println("Samochód " + this.name + " istnieje");
        IO.println("Liczba samochodów: " + numberOfCars);
    }

    public static void carInfo(Car car) {
        //Car car = new Car("Skoda Fabia", 2021);
        IO.println("Samochód " + car.name + " istnieje");
        IO.println("Liczba samochodów: " + numberOfCars);
    }
}
