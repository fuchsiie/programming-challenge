package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.utils.Utils;

/**
 * Testclass for de/exxcellent/challenge/utils/Utils
 * 
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class UtilsTest {
    @Test
    public void getReaderTestEmptyPath() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                Utils.getReader("");
            },
            "Exception expected when pathToFile is empty!");
    }

    @Test
    public void getReaderTestNullPath() {
        assertThrows(IllegalArgumentException.class,
        () -> {
            Utils.getReader(null);
        },
        "Exception expected when pathToFile is null!");
    }

    @Test
    public void getReaderTestUnknownFileType() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                Utils.getReader("/de/exxcellent/challenge/weather.json");
            },
            "Exception expected when file type is unknown!");
    }

    @Test
    public void getReaderTestSuccessful() {
        assertNotNull(Utils.getReader("de/exxcellent/challenge/weather.csv"), "This method should not return null!");
    }
}