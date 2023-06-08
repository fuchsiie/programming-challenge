package de.exxcellent.challenge.utils;

import de.exxcellent.challenge.reader.CsvReader;
import de.exxcellent.challenge.reader.DataReader;

public class Utils {
    public static DataReader getReader(String pathToFile) throws IllegalArgumentException{
        if(pathToFile.endsWith(".csv")) {
            return new CsvReader();
        } else {
            throw new IllegalArgumentException("Unknown file ending! Path provided: " + pathToFile);
        }
    }
}
