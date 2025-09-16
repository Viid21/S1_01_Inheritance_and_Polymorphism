package Level2.Model;

import Level2.Interfaces.Camera;
import Level2.Interfaces.Clock;

public class SmartPhone extends Phone{
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    Camera camera;

    {
        camera = new Camera() {
            @Override
            public String TakePhoto() {
                return "You'r taking a photo";
            }
        };
    }

    Clock clock;

    {
        clock = new Clock() {
            @Override
            public String Alarm() {
                return "Wee Woo!!!";
            }
        };
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }
}
