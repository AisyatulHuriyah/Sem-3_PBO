package Jobsheet_3;

public class MotorCycle {
    private String platNumber;
    private boolean isMechineOn;
    private int speed;

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

        public String getPlatNumber() {
            return platNumber;
        }

        public void setPlatNumber(String platNumber) {
            this.platNumber = platNumber;
        }

        public boolean isMechineOn() {
            return isMechineOn;
        }

        public void setMechineOn(boolean mechineOn) {
            isMechineOn = mechineOn;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            if (!this.isMechineOn && speed > 0) {
                System.out.println("The speed must not exceed 0 when the engine is off");
            } else {
                this.speed = speed;
            }
    }
}