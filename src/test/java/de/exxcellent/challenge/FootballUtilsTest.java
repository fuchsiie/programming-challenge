package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.utils.FootballUtils;

/**
 * Testclass for de/exxcellent/challenge/utils/FootballUtils
 * 
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class FootballUtilsTest {
    @Test
    public void getFootballDataTestEmptyPath() {
        assertNull(FootballUtils.getFootballData(""), "Exception expected when pathToFile is empty!");
    }

    @Test
    public void getFootballDataTestNullPath() {
        assertNull(FootballUtils.getFootballData(null), "Exception expected when pathToFile is null!");
    }

    @Test
    public void getFootballDataTestUnknownFileType() {
        assertNull(FootballUtils.getFootballData("/de/exxcellent/challenge/football.json"), "Exception expected when file type is unknown!");
    }

    @Test
    public void getFootballDataTestSuccessful() {
        assertNotNull(FootballUtils.getFootballData("de/exxcellent/challenge/football.csv"), "This method should not return null!");
    }

    @Test
    public void getSmallestGoalsDiffTeamByPathTestEmptyPath() {
        assertNull(FootballUtils.getSmallestGoalsDiffTeamByPath(""), "Exception expected when pathToFile is empty!");
    }

    @Test
    public void getSmallestGoalsDiffTeambyPathTestUnknownFileType() {
        assertNull(FootballUtils.getSmallestGoalsDiffTeamByPath("/de/exxcellent/challenge/football.json"), "Exception expected when file type is unknown!");
    }

    @Test
    public void getSmallestGoalsDiffTeamByPathTestSuccessful() {
        assertNotNull(FootballUtils.getSmallestGoalsDiffTeamByPath("de/exxcellent/challenge/football.csv"), "This method should not return null!");
    }

    @Test
    public void getSmallestGoalsDiffTeamTestNull() {
        assertNull(FootballUtils.getSmallestGoalsDiffTeam(null), "Exception expected when pathToFile is null!");
    }

    @Test
    public void getSmallestGoalsDiffTeamTestSuccessful() {
        assertNotNull(FootballUtils.getSmallestGoalsDiffTeam(FootballUtils.getFootballData("de/exxcellent/challenge/football.csv")), "This method should not return null!");
    }
}