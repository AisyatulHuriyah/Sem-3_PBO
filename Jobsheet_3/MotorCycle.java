package Jobsheet_3;

public class MotorCycle {
    public String platNumber;
    public boolean isMechineOn;
    public int speed;

    public void displayStatus() {
        System.out.println("Plat Number: " + this.platNumber);
        if (isMechineOn) {
            System.out.println("Mechine is On");
        } 
        else {
            System.out.println("Mechine is Off");
        }

        System.out.println("Speed : " + this.speed);
        System.out.println("=========================");
    }
}