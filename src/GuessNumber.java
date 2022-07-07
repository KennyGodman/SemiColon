import java.util.Scanner;
public class GuessNumber{
        public static void main(String[] arg){
            Scanner c = new Scanner(System.in);
            System.out.println("Guess your number");
            int number = c.nextInt();


        if (number == 80)
                System.out.println("you are correct");
        if (number < 80)
                System.out.println("the number is less");
        if (number > 80)
                System.out.println("the number is greater");

    }

}

