import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer counter = 0;
        Double sum = 0.0;
        Double result = 0.0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                counter++;
                sum += i;
            }
        }
        result = sum / counter;
        System.out.println(result);
    }
}