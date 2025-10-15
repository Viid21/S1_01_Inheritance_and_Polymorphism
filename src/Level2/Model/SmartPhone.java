package Level2.Model;

import Level2.Interfaces.Camera;
import Level2.Interfaces.Clock;

public class SmartPhone extends Phone implements Camera, Clock {
    //implements interfaces
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("You'r taking a photo");
    }

    @Override
    public void alarm() {
        System.out.println("Wee Woo!!!");
    }
}
