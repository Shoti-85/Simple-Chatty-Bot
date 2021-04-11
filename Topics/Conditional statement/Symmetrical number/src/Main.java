import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer thousands = number / 1000;
        Integer hundreds = number % 1000 / 100;
        Integer tens = number % 100 / 10;
        Integer ones = number % 10;

        if (thousands.equals(ones) && hundreds.equals(tens)) {
            System.out.println("1");
        } else {
            System.out.println("9");
        }
    }
}