package javaAssignment;

public class CalculatePrice {
        private int price = 0;

    public int price(int copies) {
        if (copies>= 1 && copies <= 4) {
            price = 3 * 2000;
        }
        else if (copies >= 5 && copies <= 9) {
            price = 6 * 1800;
        }
        else if (copies >= 10 && copies <= 29) {
            price = 12 * 1600;
        }
        else if (copies >= 30 && copies <= 49) {
            price = 34 * 1500;
        }
       else if (copies >= 50 && copies <= 99) {
            price = 52 * 1300;
        }
        else if (copies >= 100 && copies <= 199) {
            price = 103 * 1200;
        }
        else if (copies >= 200 && copies <= 499) {
            price = 202 * 2000;
        }
        else if (copies >= 500) {
            price = 501 * 1000;
        }
            return price;

        }
    }
