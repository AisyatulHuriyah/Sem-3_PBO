package Jobsheet_2;

public class Fan {
    public String brand;
    public int speed;
    public boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println(brand + " fan is now ON.");
    }

    public void turnOff() {
        isOn = false;
        speed = 0;
        System.out.println(brand + " fan is now OFF.");
    }

    public void changeSpeed(int newSpeed) {
        if (isOn) {
            speed = newSpeed;
            System.out.println(brand + " speed changed to " + speed);
        } else {
            System.out.println("Cannot change speed. " + brand + " is OFF.");
        }
    }

    public void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        System.out.println("Speed : " + speed);
        System.out.println("-------------------------");
    }
}