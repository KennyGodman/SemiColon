import java.util.Scanner;

    public class Gallon {
        public static void main(String[] args) {
            checkGallonAndMiles();

        }
        static void checkGallonAndMiles(){
            Scanner input = new Scanner(System.in);
            double miles = 0;
            double gallons = 0;
            int counter = 0;
            double total1 = 0;
            double total2 = 0;

            while(miles != -1){
                System.out.println("Please Enter the miles driven and enter -1 to break this look");
                miles = input.nextDouble();
                total1 += miles;
                counter++;
            }

            while(gallons != -1){
                System.out.println("Please Enter the gallons driven and enter -1 to break this look");
                gallons = input.nextDouble();
                total2 += gallons;
                counter++;
            }

            System.out.printf("The total miles is %.2f%n", total1);
            System.out.printf("The total gallons is %.2f%n", total2);
        }
    }


