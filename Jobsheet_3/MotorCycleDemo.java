package Jobsheet_3;

public class MotorCycleDemo {
    public static void main(String[] args) {
        MotorCycle motorCycle1 = new MotorCycle();
        motorCycle1.displayStatus();

        motorCycle1.platNumber = "B 0838 XZ";
        int newSpeed = 50;

        if(!motorCycle1.isMechineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off");
        }
        else {
            motorCycle1.speed = newSpeed;
        }
        motorCycle1.displayStatus();

        MotorCycle motorCycle2 = new MotorCycle();
        motorCycle2.platNumber = "N 9840 AB";
        motorCycle2.isMechineOn = true;
        motorCycle2.speed = 40;

        if(!motorCycle2.isMechineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off");
        }
        else {
            motorCycle2.speed = newSpeed;
        }
        motorCycle2.displayStatus();

        MotorCycle motorCycle3 = new MotorCycle();
        motorCycle3.platNumber = "D 8343 CV";
        motorCycle3.speed = 60;

        if(!motorCycle3.isMechineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off");
        }
        else {
            motorCycle3.speed = newSpeed;
        }
        motorCycle3.displayStatus();
    }
}