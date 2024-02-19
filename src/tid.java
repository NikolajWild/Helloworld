import java.util.Arrays;

public class tid {
    public static void main(String[] args) {
        int sekunder = 58;
        int minut = 10;
        int hour = 11;
        int sekunderSidenMidnat = 40410;
        int sekunderIndtilMidnat = 45990;
        int timeOpgaveFærdig = 11;
        int minutOpgaveFærdig = 19;
        int sekundOpgaveFærdig = 50;


        System.out.println("sekunder: " + sekunder);
        System.out.println("Siden Midnat er der gået " + sekunderSidenMidnat + " sekunder");
        System.out.println("Der er " + sekunderIndtilMidnat + " sekunder indtil midnat");
        System.out.println("Opgaven blev færdig kl: " + timeOpgaveFærdig + "." + minutOpgaveFærdig + "."+ sekundOpgaveFærdig);
        System.out.println("Det har taget 9 minutter og 8 sekunder at løse opgaven");

    }
}
