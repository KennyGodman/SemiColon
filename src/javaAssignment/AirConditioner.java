package javaAssignment;

public class AirConditioner {
    private String name;
    private boolean isOn;
    private int temperature = 16 ;

public AirConditioner(String name, boolean isOn, int temperature){
    this.name = name;
    this.isOn = isOn;
    this.temperature = temperature;
}
public AirConditioner(){

}
public void setName(String name) {
    this.name = name;
}
 public String getName(){
        return name;
    }
    public void setOn(boolean isOn){
    this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }
    public void setTemperature(int temperature){
     this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public int increaseTemperature(int amount){
        if (temperature <= 16){
            temperature = 16;
            return temperature;
        }
         return temperature - amount;
    }


    public int decreaseTemperature(int amount){
        if (temperature >= 30){
            temperature = 30;
            return temperature;
        }

        return temperature + amount;
    }

    public boolean turnOn(){
        return true;
    }

    public boolean turnOff() {
         return false;
    }
}
