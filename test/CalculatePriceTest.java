import javaAssignment.CalculatePrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatePriceTest {

    @Test
    void rangeBetweenOneToFourCopiesTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(3);
        assertEquals(price, 6000);

    }

    @Test
    void rangeBetweenFiveToNineCopiesTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(6);
        assertEquals(price, 10800);

    }

    @Test
    void rangeBetweenTenToTwentyNineCopiesTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(12);
        assertEquals(price, 19200);

    }

    @Test
    void rangeBetweenThirtyToFortyNineCopiesTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(34);
        assertEquals(price, 51000);

    }
    @Test
    void rangeBetweenFiftyToNinetyNineCopiesTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(52);
        assertEquals(price, 67600);

    }
    @Test
    void rangeBetweenHundredToHundredAndNinetyNineCopiesTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(102);
        assertEquals(price, 123600);

    }
    @Test
    void rangeBetweenTwoHundredToFourHundredAndNinetyNineCopiesTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(202);
        assertEquals(price, 404000);

    }
    @Test
    void CopiesAboveFiveHundredTest(){
        CalculatePrice calculatePrice = new CalculatePrice();
        int price = calculatePrice.price(501);
        assertEquals(price, 501000);

    }
}
