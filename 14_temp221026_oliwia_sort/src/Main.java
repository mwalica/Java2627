import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<String> names = new ArrayList<>(List.of("Krzysztof", "Gustaw", "Adam"));
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Fiat", 2021));
        cars.add(new Car("Skoda", 2010));
        cars.add(new Car("Audio", 2001));

        names.sort((name1, name2) -> name1.compareTo(name2));
        cars.sort((car1, car2) -> car2.getName().compareTo(car1.getName()));
        cars.sort((car1, car2) -> car1.getProductionYear() - car2.getProductionYear());

        System.out.println(names);
        System.out.println(cars);
    }
}
