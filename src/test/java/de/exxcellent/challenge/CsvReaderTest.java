package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.reader.CsvReader;
import de.exxcellent.challenge.utils.Utils;

/**
 * Testclass for de/exxcellent/challenge/utils/Utils
 * 
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class CsvReaderTest {
    private CsvReader csvReader;

    public CsvReaderTest() {
        csvReader = new CsvReader();
    }
    
    @Test
    public void loadDataTestEmpyPath() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                csvReader.loadData("", Weather.class);
            },
            "Exception expected when pathToFile is empty!");
    }

    @Test
    public void loadDataTestNullPath() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                csvReader.loadData(null, Weather.class);
            },
            "Exception expected when pathToFile is null!");
    }

    @Test
    public void loadDataTestWrongPath() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                csvReader.loadData("de/exxcellent/weather.csv", Weather.class);
            },
            "Exception expected when pathToFile is wrong!");
    }

    @Test
    public void loadDataTestNullClass() {
        assertThrows(IllegalStateException.class,
            () -> {
                csvReader.loadData("de/exxcellent/challenge/weather.csv", null);
            },
            "Exception expected when classToFill is null!");
    }

    @Test
    public void loadDataTestSuccessful() throws IllegalArgumentException, IllegalStateException, FileNotFoundException {
        assertNotNull(csvReader.loadData("de/exxcellent/challenge/weather.csv", Weather.class), "This method should not return null!");
    }

    @Test
    public void validatePathToFileTestEmptyPath() {
        assertThrows(IllegalArgumentException.class,
        () -> {
            csvReader.validatePathToFile("");
        },
        "Exception expected when pathToFile is empty!");
    }

    @Test
    public void validatePathToFileTestNullPath() {
        assertThrows(IllegalArgumentException.class,
        () -> {
            csvReader.validatePathToFile(null);
        },
        "Exception expected when pathToFile is null!");
    }

    @Test
    public void validatePathToFileTestWrongPath() {
        assertThrows(IllegalArgumentException.class,
        () -> {
            csvReader.validatePathToFile("de/exxcellent/weather.csv");
        },
        "Exception expected when pathToFile is wrong!");
    }

    @Test
    public void validatePathToFileTestUnknownFileType() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                csvReader.validatePathToFile("/de/exxcellent/challenge/weather.json");
            },
            "Exception expected when file type is unknown!");
    }

    @Test
    public void validatePathToFileTestSuccessful() {
        assertNotNull(csvReader.validatePathToFile("de/exxcellent/challenge/weather.csv"), "This method should not return null!");
    }

    @Test
    public void getAbsolutePathtoFileTestEmptyPath() {
        assertThrows(IllegalArgumentException.class,
        () -> {
            csvReader.getAbsolutePathToFile("");
        },
        "Exception expected when pathToFile is empty!");
    }

    @Test
    public void getAbsolutePathToFileTestNullPath() {
        assertThrows(IllegalArgumentException.class,
        () -> {
            csvReader.getAbsolutePathToFile(null);
        },
        "Exception expected when pathToFile is null!");
    }

    @Test
    public void getAbsolutePathToFileTestWrongPath() {
        assertThrows(IllegalArgumentException.class,
        () -> {
            csvReader.getAbsolutePathToFile("de/exxcellent/weather.csv");
        },
        "Exception expected when pathToFile is wrong!");
    }

    @Test
    public void getAbsolutePathToFileTestUnknownFileType() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                csvReader.getAbsolutePathToFile("/de/exxcellent/challenge/weather.json");
            },
            "Exception expected when file type is unknown!");
    }

    @Test
    public void getAbsolutePathToFileTestSuccessful() {
        assertNotNull(csvReader.getAbsolutePathToFile("de/exxcellent/challenge/weather.csv"), "This method should not return null!");
    }
}