import model.Car;

void main() {

    IO.println("Wersja programu: " + Const.PROGRAM_INFO);
    IO.println("Autor: " + Const.AUTHOR);
    Car car1 = new Car("Fiat Panda", 2022);
    IO.println(Car.numberOfCars);
//    Car car2 = new Car("Ford Focus", 2019);
//    IO.println(Car.numberOfCars);
//    Car car3 = new Car("Opel Corsa", 2019);
//    IO.println(Car.numberOfCars);

    IO.println("Ilość obiektów klasy Car: " + Car.numberOfCars);
    Car.carInfo(car1);

}