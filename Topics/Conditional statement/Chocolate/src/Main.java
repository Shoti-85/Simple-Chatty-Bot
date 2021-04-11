import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();
        Integer k = scanner.nextInt();

        if (k > n * m) {
            System.out.println("NO");
        } else if (k % m == 0 || k % n == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}