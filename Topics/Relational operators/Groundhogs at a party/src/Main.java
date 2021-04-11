import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfReeses = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean reesesForWeekdays = numberOfReeses >= 10 && numberOfReeses <= 20 && !weekend;
        boolean reesesForWeekends = numberOfReeses >= 15 && numberOfReeses <= 25 && weekend;

        System.out.println(reesesForWeekdays || reesesForWeekends);
    }
}