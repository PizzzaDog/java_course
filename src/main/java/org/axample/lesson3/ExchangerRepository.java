package org.axample.lesson3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ExchangerRepository {
    private final String rateDBPath = "src/main/resources/exchange_rate_db.txt";
    private final String cashDBPath = "src/main/resources/exchange_cash.txt";

    public ExchangerRepository() {
    }

    public HashMap<Currency, Double> getCash() throws IOException {
        final FileReader cashDB = new FileReader(cashDBPath);
        Scanner scan = new Scanner(cashDB);
        HashMap<Currency, Double> cash = new HashMap<>();

        while (scan.hasNextLine()) {
            String[] cashData = scan.nextLine().split(":");
            cash.put(Currency.valueOf(cashData[0]),Double.valueOf(cashData[1]));
        }
        cashDB.close();
        return cash;
    }

    public void updateCash(HashMap<Currency, Double> newCash) throws IOException {
        FileWriter fileWriter = new FileWriter(cashDBPath);
        for (Map.Entry<Currency, Double> entry : newCash.entrySet()) {
            fileWriter.write(entry.getKey() + ":" + entry.getValue() + "\n");
        }
        fileWriter.close();
    }

    public Double getRateByCurrency(Currency currencyFrom, Currency currencyTo) throws IOException {
        final FileReader rateDB = new FileReader(rateDBPath);
        Scanner scan = new Scanner(rateDB);

        while(scan.hasNextLine()) {
            String[] toModel = scan.nextLine().split(":");
            ExchangerRateModel model = new ExchangerRateModel();

            model.setCurrencyFrom(Currency.valueOf(toModel[0]));
            model.setCurrencyTo(Currency.valueOf(toModel[1]));
            model.setAmount(Double.valueOf(toModel[2]));

            if (currencyFrom == model.getCurrencyFrom() && currencyTo == model.getCurrencyTo()) {
                rateDB.close();
                return model.getAmount();
            }
        }
        rateDB.close();
        return null;
    }

    public Double getCashByCurrency(Currency currency) throws IOException {
        final FileReader cashDB = new FileReader(cashDBPath);
        Scanner scan = new Scanner(cashDB);

        while (scan.hasNextLine()) {
            String[] cashData = scan.nextLine().split(":");
            if (Currency.valueOf(cashData[0]) == currency) {
                cashDB.close();
                return Double.valueOf(cashData[1]);
            }
        }

        cashDB.close();
        return null;
    }

    public List<ExchangerRateModel> getAllRates() throws IOException {
        final FileReader rateDB = new FileReader(rateDBPath);
        Scanner scan = new Scanner(rateDB);
        List<ExchangerRateModel> result = new ArrayList<>();

        while(scan.hasNextLine()){
            String[] toModel = scan.nextLine().split(":");
            ExchangerRateModel model = new ExchangerRateModel();

            model.setCurrencyFrom(Currency.valueOf(toModel[0]));
            model.setCurrencyTo(Currency.valueOf(toModel[1]));
            model.setAmount(Double.valueOf(toModel[2]));

            result.add(model);
        }
        rateDB.close();
        return result;
    }
}
