package Jobsheet_2;

public class FanDemo {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.brand = "Miyako";
        fan1.speed = 1;
        fan1.isOn = false;

        Fan fan2 = new Fan();
        fan2.brand = "Panasonic";
        fan2.speed = 3;
        fan2.isOn = true;

        System.out.println("=== FAN 1 ===");
        fan1.displayInfo();
        fan1.turnOn();
        fan1.changeSpeed(2);
        fan1.displayInfo();

        System.out.println("=== FAN 2 ===");
        fan2.displayInfo();
        fan2.changeSpeed(5);
        fan2.turnOff();
        fan2.displayInfo();
    }
}

