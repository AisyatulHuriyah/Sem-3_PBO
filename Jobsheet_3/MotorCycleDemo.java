package Jobsheet_3;

public class MotorCycleDemo {
    public static void main(String[] args) {
        MotorCycle motorCycle1 = new MotorCycle();
        motorCycle1.displayStatus();

        motorCycle1.platNumber = "B 0838 XZ";
        motorCycle1.speed = 50;
        motorCycle1.displayStatus();

        MotorCycle motorCycle2 = new MotorCycle();
        motorCycle2.platNumber = "N 9840 AB";
        motorCycle2.isMechineOn = true;
        motorCycle2.speed = 40;
        motorCycle2.displayStatus();

        MotorCycle motorCycle3 = new MotorCycle();
        motorCycle3.platNumber = "D 8343 CV";
        motorCycle3.speed = 60;
        motorCycle3.displayStatus();
    }
}