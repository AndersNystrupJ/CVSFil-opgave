import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> covidTal = fh.loadNøgletal();

        for (Covid19Data nøgletal : covidTal) {
            System.out.println(covidTal);
        }
    }
}
