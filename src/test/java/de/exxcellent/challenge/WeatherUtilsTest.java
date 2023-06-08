package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.utils.WeatherUtils;

/**
 * Testclass for de/exxcellent/challenge/utils/WeatherUtils
 * 
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class WeatherUtilsTest {
    @Test
    public void getWeatherDataTestEmptyPath() {
        assertNull(WeatherUtils.getWeatherData(""), "Exception expected when pathToFile is empty!");
    }

    @Test
    public void getWeatherDataTestNullPath() {
        assertNull(WeatherUtils.getWeatherData(null), "Exception expected when pathToFile is null!");
    }

    @Test
    public void getWeatherDataTestUnknownFileType() {
        assertNull(WeatherUtils.getWeatherData("/de/exxcellent/challenge/weather.json"), "Exception expected when file type is unknown!");
    }

    @Test
    public void getWeatherDataTestSuccessful() {
        assertNotNull(WeatherUtils.getWeatherData("de/exxcellent/challenge/weather.csv"), "This method should not return null!");
    }

    @Test
    public void getSmallestMinMaxTempDiffDayByPathTestEmptyPath() {
        assertNull(WeatherUtils.getSmallestMinMaxTempDiffDayByPath(""), "Exception expected when pathToFile is empty!");
    }

    @Test
    public void getSmallestMinMaxTempDiffDaybyPathTestUnknownFileType() {
        assertNull(WeatherUtils.getSmallestMinMaxTempDiffDayByPath("/de/exxcellent/challenge/weather.json"), "Exception expected when file type is unknown!");
    }

    @Test
    public void getSmallestMinMaxTempDiffDayByPathTestSuccessful() {
        assertNotNull(WeatherUtils.getSmallestMinMaxTempDiffDayByPath("de/exxcellent/challenge/weather.csv"), "This method should not return null!");
    }

    @Test
    public void getSmallestMinMaxTempDiffDayTestNull() {
        assertNull(WeatherUtils.getSmallestMinMaxTempDiffDay(null), "Exception expected when pathToFile is null!");
    }

    @Test
    public void getSmallestMinMaxTempDiffDayTestSuccessful() {
        assertNotNull(WeatherUtils.getSmallestMinMaxTempDiffDay(WeatherUtils.getWeatherData("de/exxcellent/challenge/weather.csv")), "This method should not return null!");
    }
}