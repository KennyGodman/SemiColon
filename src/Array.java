public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int total = 0;
        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 1;
        numbers[3] = 4;
        numbers[4] = 6;
        numbers[5] = 7;
        numbers[6] = 2;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 7;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        System.out.println(total);
    }
}