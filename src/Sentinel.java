import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SENTINEL = -1;
        int sum = 0;
        int brugerTal = 0;

        while (brugerTal != SENTINEL){
            System.out.println("Indsæt de tal du gerne ligge sammen.");
            brugerTal = scanner.nextInt();
            sum += brugerTal;
            System.out.println("Dit stykke gav " + brugerTal + " = " + sum);

        }
        System.out.println(brugerTal+brugerTal + " er =" + sum);


    }
}
