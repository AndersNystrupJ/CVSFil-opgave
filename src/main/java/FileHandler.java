import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadNøgletal() {
        ArrayList<Covid19Data> covid19data = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data covid19dataTing = null;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] attributes = line.split(";");
            covid19dataTing = new Covid19Data(
                    attributes[0],
                    attributes[1],
                    (Integer.parseInt(attributes[2])),
                    (Integer.parseInt(attributes[3])),
                    (Integer.parseInt(attributes[4])),
                    (Integer.parseInt(attributes[5])),
                    attributes[6]

            );

            covid19data.add(covid19dataTing);
        }
        scanner.close();
        return covid19data;
    }
}
