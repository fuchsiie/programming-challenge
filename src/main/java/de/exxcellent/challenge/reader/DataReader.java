package de.exxcellent.challenge.reader;

import java.util.List;

import de.exxcellent.challenge.model.Data;

public interface DataReader {
    public List<? extends Data> loadData(String pathToFile, java.lang.Class<? extends Data> classToFill);
    public boolean validatePathToFile(String pathToFile);    
}
