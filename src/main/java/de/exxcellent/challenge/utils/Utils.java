package de.exxcellent.challenge.utils;

import de.exxcellent.challenge.reader.CsvReader;
import de.exxcellent.challenge.reader.DataReader;

/**
 * Collection of utilities for working with data readers.
 * 
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class Utils {
    public static DataReader getReader(String pathToFile) throws IllegalArgumentException{
        if(pathToFile != null && pathToFile.endsWith(".csv")) {
            return new CsvReader();
        } else {
            throw new IllegalArgumentException("Unknown file ending! Path provided: " + pathToFile);
        }
    }
}
