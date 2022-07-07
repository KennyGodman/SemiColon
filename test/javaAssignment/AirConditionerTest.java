package javaAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class  AirConditionerTest {

    @Test
    void turnOn() {
        //given
        AirConditioner lg = new AirConditioner();
        //when
        boolean isOn = lg.turnOn();
        //check
        assertTrue(isOn);
    }
@Test
    void turnOff() {
        //given
        AirConditioner lg = new AirConditioner();
        //when
        boolean isOff = lg.turnOff();
        //check
        assertFalse(isOff);
    }
 @Test
    void increaseTemperature(){
        //given
        AirConditioner lg = new AirConditioner();
        lg.setTemperature(18);
        //when
        int result = lg.increaseTemperature(1);
        //check
        assertEquals(17, result);

    }

    @Test
    void decreaseTemperature(){
        //given
        AirConditioner lg = new AirConditioner();
        lg.setTemperature(18);
        //when
        int result = lg.decreaseTemperature(1);
        //check
        assertEquals(19, result);

    }

    @Test
    void decreaseTemperatureCanNotBeAbove30() {
        //given
        AirConditioner lg = new AirConditioner();

        lg.setTemperature(30);
        lg.decreaseTemperature(1);

        //when
        int result = lg.getTemperature();
        //check
        assertEquals(30, result);
    }

    @Test
    void increaseTemperatureCanNotBeBelow16() {
        //given
        AirConditioner lg = new AirConditioner();

        lg.setTemperature(16);
        lg.increaseTemperature(1);

        //when
        int result = lg.getTemperature();
        //check
        assertEquals(16, result);
    }
}
