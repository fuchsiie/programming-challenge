package de.exxcellent.challenge.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import de.exxcellent.challenge.model.Data;

import com.opencsv.bean.CsvToBeanBuilder;

/**
 * Class for reading data from ".csv" files
 *
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class CsvReader implements DataReader {
    /**
     * Loads data from ".csv" files and parses it into a list of objects.
     * 
     * @param pathToFile Absolute or relative path to the data file.
     * @param classToFill Class from models to fill with the data.
     * @return Returns list of desired objects created from loaded data.
     */
    @Override
    public List<? extends Data> loadData(String pathToFile, java.lang.Class<? extends Data> classToFill) throws IllegalArgumentException, IllegalStateException, FileNotFoundException {
        String absolutePath = validatePathToFile(pathToFile);
        List<? extends Data> resultList = new CsvToBeanBuilder<Data>(new FileReader(absolutePath)).withType(classToFill).build().parse();
        return resultList;
    }

    /**
     * Validates the pathToFile.
     * 
     * @param pathToFile Absolute or relative path to the data file.
     * @return Returns the validated absolute path to the data file.
     */
    @Override
    public String validatePathToFile(String pathToFile) throws IllegalArgumentException {
        String absolutePath = getAbsolutePathToFile(pathToFile);
        if(absolutePath.endsWith(".csv")) {
            return absolutePath;
        } else {
            throw new IllegalArgumentException("The CsvReader was provided with a file that doesn't end with \".csv\"! Path: " + pathToFile);
        }
    }

    /**
     * Checks if pathToFile is absolute or relative and get's the absolute path if it's relative.
     * 
     * @param pathToFile Absolute or relative path to the file.
     * @return Returns the absolute path to the file.
     */
    @Override
    public String getAbsolutePathToFile(String pathToFile) throws IllegalArgumentException {
        if(pathToFile == null || pathToFile.isEmpty()) {
            throw new IllegalArgumentException("The provided path to the file is either empty or null! Path: " + pathToFile);
        }
        try {
            File f = new File(pathToFile);
            if(f.exists()) {
                return pathToFile;
            } else {
                String absolutePath = this.getClass().getClassLoader().getResource(pathToFile).getFile();
                return absolutePath;
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("The file to which the path points could not be found! Path: " + pathToFile);
        }
        
    }
}
