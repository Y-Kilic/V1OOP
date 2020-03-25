package Practicum_11;

import Practicum_9A.Utils;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter {
    public ArrayList<String> convertDollarToEuro(List<String> listDollars, double rate) throws Exception {
        try{
            ArrayList<String> listEuros = new ArrayList<String>();

            for (String line : listDollars) {
                String currency = line.split(":")[1];
                Double rateChanged = Double.parseDouble(currency) * rate;

                listEuros.add(line.split(":")[0] + ": " +  Utils.euroBedrag(rateChanged, 2));

            }
            return listEuros;
        }catch(Exception ex){
            throw new Exception("Fout tijdens het omzetten van dollar naar euro.");
        }

    }
}
