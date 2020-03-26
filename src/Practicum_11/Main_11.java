package Practicum_11;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {

        try{
        Scanner keyboardScanner = new Scanner(System.in);
        String pathToDollars = "";
        String pathToEuros = "";
        String rateDollarEuro = "";

        while (true) {
            System.out.println("Voer source in.");
            pathToDollars = keyboardScanner.nextLine();

            if(!Files.exists(Path.of(pathToDollars)) || !Files.isRegularFile(Path.of(pathToDollars))){
                System.out.println("Bestand bestaat niet, probeert u het nogmaals");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Voer het bestemmingsbestand in");
            pathToEuros = keyboardScanner.nextLine();

            if(!Files.exists(Path.of(pathToEuros)) || !Files.isRegularFile(Path.of(pathToEuros))){
                System.out.println("Bestand bestaat niet, probeert u het nogmaals");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Voer de waarde van 1 US dollar in Eurocenten");
             rateDollarEuro = keyboardScanner.nextLine();

            try {
                Double num = Double.parseDouble(rateDollarEuro);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Voer een correct waarde in! ");
            }
        }

        System.out.println("Click enter om te beginnen met het omzetten.");
        keyboardScanner.nextLine();

        var bedragenDollars = new TextManager(pathToDollars);
        var bedragenEuros = new TextManager(pathToEuros);

        //var bedragenDollars = new TextManager("C:\\Users\\x\\Documents\\bedragenInDollars.txt");
        //var bedragenEuros = new TextManager("C:\\Users\\x\\Documents\\bedragenInEuros.txt");

        var currenyConverter = new CurrencyConverter();
        var result = currenyConverter.convertDollarToEuro(bedragenDollars.getText(), Double.parseDouble(rateDollarEuro));

        for (String line : result) {
            System.out.println(line);
        }

        bedragenEuros.writeText(result, false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
