package de.exxcellent.challenge.reader;

import java.io.FileNotFoundException;
import java.util.List;

import de.exxcellent.challenge.model.Data;

/**
 * Interface for reader classes.
 *
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public interface DataReader {
    public List<? extends Data> loadData(String pathToFile, java.lang.Class<? extends Data> classToFill) throws IllegalArgumentException, IllegalStateException, FileNotFoundException;
    public String validatePathToFile(String pathToFile);    
    public String getAbsolutePathToFile(String pathToFile);
}
