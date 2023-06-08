package de.exxcellent.challenge;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.utils.FootballUtils;
import de.exxcellent.challenge.utils.WeatherUtils;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
        Weather smallestTempDiffEntry = WeatherUtils.getSmallestMinMaxTempDiffDayByPath("de/exxcellent/challenge/weather.csv");

        String dayWithSmallestTempSpread = smallestTempDiffEntry != null
            ? Integer.toString(smallestTempDiffEntry.getDay())
            : "There was an error finding the requested day!";     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        Football smallestGoalSpreadEntry = FootballUtils.getSmallestGoalsDiffTeamByPath("de/exxcellent/challenge/football.csv");

        String teamWithSmallestGoalSpread = smallestGoalSpreadEntry != null
            ? smallestGoalSpreadEntry.getTeam()
            : "There was an error finding the requested football team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
