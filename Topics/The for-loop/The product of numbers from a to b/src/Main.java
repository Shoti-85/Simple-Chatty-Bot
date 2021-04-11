import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        Long b = scanner.nextLong();
        Long result = a;

        for (long i = a +1; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}