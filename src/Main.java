import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine Zahl zwischen 0 & 24 ein");
        int workTime = sc.nextInt();

        if (workTime == 12) {
            System.out.println("MITTAG :D");
        } else if (workTime <= 16 && workTime >= 8) {
            System.out.println("Es ist während der Arbeitszeit");
        } else {
            System.out.println("Geh oabeitn");
        }

    }
}
