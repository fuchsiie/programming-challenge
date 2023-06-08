package de.exxcellent.challenge.reader;

import java.util.List;

import de.exxcellent.challenge.model.Data;

public class CsvReader implements DataReader {

    @Override
    public List<? extends Data> loadData(String pathToFile, Class<? extends Data> classToFill) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadData'");
    }

    @Override
    public boolean validatePathToFile(String pathToFile) {
        if(!pathToFile.isBlank() && pathToFile.endsWith(".csv")) {
            return true;
        } else {
            return false;
        }
    }
    
}
