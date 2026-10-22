public class Car {
    private String name;
    private int productionYear;

    public Car(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return name + " = " + productionYear;
    }
}
