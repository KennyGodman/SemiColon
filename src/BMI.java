
    import java.util.Scanner;
    public class BMI{

        private static void print(){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter weight in pounds");
            double weightInPounds = input.nextDouble();

            System.out.print("Enter height in metres");
            double heightInMetres = input.nextDouble();

            double weightInKg = weightInPounds * 0.45359237;
            double heightInInches = heightInMetres * 0.0254;

            double heightInInchesSquare = heightInInches * heightInInches;

            double bmi = weightInKg / heightInInchesSquare;
            System.out.printf("BMI is %f", bmi);

        }


        public static void main(String[] args){
            print();
        }
    }


