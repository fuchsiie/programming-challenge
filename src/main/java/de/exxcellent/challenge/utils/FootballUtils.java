package de.exxcellent.challenge.utils;

import java.io.FileNotFoundException;
import java.util.List;

import de.exxcellent.challenge.model.Football;

/**
 * Collection of utilities for working with Football data.
 * 
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class FootballUtils {
    /**
     * Loads data from file at pathToFile and returns a parsed list of football objects.
     * 
     * @param pathToFile Absolute or relative path to the data file.
     * @return Returns a list of football objects parsed from the provided data file.
     */
    @SuppressWarnings("unchecked")
    public static List<Football> getFootballData(String pathToFile) throws IllegalArgumentException {
        try {
            return (List<Football>) Utils.getReader(pathToFile).loadData(pathToFile, Football.class);
        } catch (IllegalArgumentException | IllegalStateException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Loads data from file at pathToFile and returns the football entry with the smallest difference between goals and goals allowed.
     * 
     * @param pathToFile Absolute or relative path to the data file.
     * @return Returns the football entry with the smallest difference between goals and goals allowed.
     */
    public static Football getSmallestGoalsDiffTeamByPath(String pathToFile) {
        try {
            List<Football> weatherList = getFootballData(pathToFile);
            return getSmallestGoalsDiffTeam(weatherList);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get's the football entry with the smallest difference between goals and goals allowed from list of football objects.
     * 
     * @param weatherList List of football objects.
     * @return Returns the football entry with the smallest difference between goals and goals allowed.
     */
    public static Football getSmallestGoalsDiffTeam(List<Football> footballList) {
        if(footballList == null) {
            return null;
        }
        Football smallestDiff = footballList.get(0);
        for (Football entry : footballList) {
            smallestDiff = smallestDiff.calcDeltaGoals() <= entry.calcDeltaGoals() ? smallestDiff : entry;
        }
        return smallestDiff;
    }
}
