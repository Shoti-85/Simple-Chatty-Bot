import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstH = scanner.nextInt();
        int firstM = scanner.nextInt();
        int firstS = scanner.nextInt();

        int secondH = scanner.nextByte();
        int secondM = scanner.nextInt();
        int secondS = scanner.nextInt();

        int difference = ((secondH - firstH) * 3600 + (secondM - firstM) * 60 + (secondS - firstS));
        System.out.println(difference);
    }
}