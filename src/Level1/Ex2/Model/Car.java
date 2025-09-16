package Level1.Ex2.Model;

public class Car {

    static final String BRAND = "Mercedes";
    static String model;
    final int POWER = 130;

    public Car(String model) {
        this.model = model;
    }

    public static String getModel() {
        return model;
    }
    public int getPOWER() {
        return POWER;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static void Decrease() {
        System.out.println("Car Decrease");
    }

    public  void Accelerate(){
        System.out.println("Car Accelerate");
    }
}
