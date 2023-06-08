package de.exxcellent.challenge.utils;

import java.io.FileNotFoundException;
import java.util.List;

import de.exxcellent.challenge.model.Weather;

public class WeatherUtils {
    @SuppressWarnings("unchecked")
    public static List<Weather> getWeatherData(String pathToFile) throws IllegalArgumentException {
        try {
            return (List<Weather>) Utils.getReader(pathToFile).loadData(pathToFile, Weather.class);
        } catch (IllegalArgumentException | IllegalStateException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Weather getSmallestMinMaxTempDiffDay(String pathToFile) {
        try {
            List<Weather> weatherList = getWeatherData(pathToFile);
            return getSmallestMinMaxTempDiffDay(weatherList);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Weather getSmallestMinMaxTempDiffDay(List<Weather> weatherList) {
        Weather smallestDiff = weatherList.get(0);
        for (Weather entry : weatherList) {
            smallestDiff = smallestDiff.calcDeltaTemperature() <= entry.calcDeltaTemperature() ? smallestDiff : entry;
        }
        return smallestDiff;
    }
}
