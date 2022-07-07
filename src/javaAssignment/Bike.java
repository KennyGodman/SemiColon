package javaAssignment;

public class Bike {

    private boolean isOn;
    private int speed;
    private int gear;

    public Bike(){

    }

    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return false;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    public int bikeAccelerate() {
        if (gear == 1)
            speed = speed + 1;
        if (gear == 2)
            speed = speed + 2;
        if (gear == 3)
            speed = speed + 3;
        if (gear == 4)
            speed = speed + 4;
        return speed;
    }

    public int bikeDecelerate() {
        if (gear==1)
            speed = speed - 1;
        if (gear==2)
            speed = speed -2;
        if (gear==3)
            speed = speed - 3;
        if (gear==4)
            speed = speed - 4;
        return speed;
    }

    public int speedRange(int firstrange){
        if (firstrange >=0 && firstrange <=20)
            gear = 1;
        if (firstrange >=21 && firstrange <=30)
            gear = 2;
        if (firstrange >=31 && firstrange <=40)
            gear = 3;
        if (firstrange >=41)
            gear = 4;
        return firstrange;
    }

    public int getGear() {
        return gear;
    }
}





