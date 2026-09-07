package Jobsheet_3;

public class MotorCycleDemo {
    public static void main(String[] args) {
        MotorCycle motorCycle1 = new MotorCycle();
        motorCycle1.displayStatus();

        motorCycle1.setPlatNumber("B 0838 XZ");
        motorCycle1.setSpeed(50);
        motorCycle1.displayStatus();

        MotorCycle motorCycle2 = new MotorCycle();
        motorCycle2.setPlatNumber("N 9840 AB");
        motorCycle2.setMechineOn(true);
        motorCycle2.setSpeed(40);
        motorCycle2.displayStatus();

        MotorCycle motorCycle3 = new MotorCycle();
        motorCycle3.setPlatNumber("D 8343 CV");
        motorCycle3.setSpeed(60);
        motorCycle3.displayStatus();
    }
}