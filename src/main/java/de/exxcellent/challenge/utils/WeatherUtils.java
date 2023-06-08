package de.exxcellent.challenge.utils;

import java.io.FileNotFoundException;
import java.util.List;

import de.exxcellent.challenge.model.Weather;

/**
 * Collection of utilities for working with Weather data.
 * 
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class WeatherUtils {
    /**
     * Loads data from file at pathToFile and returns a parsed list of weather objects.
     * 
     * @param pathToFile Absolute or relative path to the data file.
     * @return Returns a list of weather objects parsed from the provided data file.
     */
    @SuppressWarnings("unchecked")
    public static List<Weather> getWeatherData(String pathToFile) throws IllegalArgumentException {
        try {
            return (List<Weather>) Utils.getReader(pathToFile).loadData(pathToFile, Weather.class);
        } catch (IllegalArgumentException | IllegalStateException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Loads data from file at pathToFile and returns the weather entry with the smallest difference between maximum and minimum temperature.
     * 
     * @param pathToFile Absolute or relative path to the data file.
     * @return Returns the weather entry with the smallest difference between maximum and minimum temperature.
     */
    public static Weather getSmallestMinMaxTempDiffDay(String pathToFile) {
        try {
            List<Weather> weatherList = getWeatherData(pathToFile);
            return getSmallestMinMaxTempDiffDay(weatherList);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get's the weather entry with the smallest difference between maximum and minimum temperature from list of weather objects.
     * 
     * @param weatherList List of weather objects.
     * @return Returns the weather entry with the smallest difference between maximum and minimum temperature.
     */
    public static Weather getSmallestMinMaxTempDiffDay(List<Weather> weatherList) {
        Weather smallestDiff = weatherList.get(0);
        for (Weather entry : weatherList) {
            smallestDiff = smallestDiff.calcDeltaTemperature() <= entry.calcDeltaTemperature() ? smallestDiff : entry;
        }
        return smallestDiff;
    }
}
