import java.util.Random;
public class Terningkast {
    public static void main(String[] args) {
        Random terning = new Random();
        int sum = 0;

        while (sum!=7){
            int terningEt = terning.nextInt(6) + 1;
            int terningTo = terning.nextInt(6) + 1;
            sum = terningEt+terningTo;
            System.out.println(terningEt + " + " + terningTo + " = " + sum);


        }
    }
}
