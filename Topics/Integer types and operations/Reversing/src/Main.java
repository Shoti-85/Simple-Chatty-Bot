import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer hundreds = number / 100;
        Integer tens = number % 100 / 10;
        Integer ones = number % 10;

        Integer reversed = ones * 100 + tens * 10 + hundreds * 1;

        System.out.print(reversed);
    }
}