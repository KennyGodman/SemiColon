package javaAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void turnOnBike() {
        //given
        Bike bajaj = new Bike();
        //when
        boolean isOn = bajaj.turnOn();
        //check
        assertTrue(isOn);
    }

    @Test
    void turnOffBike() {
        //given
        Bike bajaj = new Bike();
        //when
         boolean isOff = bajaj.turnOff();
        //check
        assertFalse(isOff);
    }
    @Test
    void bikeAccelerate(){
        //given
        Bike bajaj = new Bike();
        //when
        bajaj.setSpeed(12);
        bajaj.setGear(2);
        //check
        assertEquals(14, bajaj.bikeAccelerate());

    }
    @Test
    void bikeDecelerate(){
        //given
        Bike bajaj = new Bike();
        //when
        bajaj.setSpeed(12);
        bajaj.setGear(2);
        //check
        assertEquals(10, bajaj.bikeDecelerate());

    }

 @Test
    void SpeedRange(){
     //given
     Bike bajaj = new Bike();
     //when
     bajaj.speedRange(50);
     //check
     assertEquals(4, bajaj.getGear());

 }
}


