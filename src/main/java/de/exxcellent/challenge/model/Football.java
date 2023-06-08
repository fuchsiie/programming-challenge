package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

/**
 * Class represents one football team.
 *
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class Football extends Data {
    @CsvBindByName(column = "Team")
    private String team;
    @CsvBindByName(column = "Games")
    private int games;
    @CsvBindByName(column = "Wins")
    private int wins;
    @CsvBindByName(column = "Losses")
    private int losses;
    @CsvBindByName(column = "Draws")
    private int draws;
    @CsvBindByName(column = "Goals")
    private int goals;
    @CsvBindByName(column = "Goals Allowed")
    private int goals_allowed;
    @CsvBindByName(column = "Points")
    private int points;

    /**
     * Calculates the absolute difference between goals and goals_allowed.
     * @return Returns the calculated difference.
     */
    public int calcDeltaGoals() {
        return Math.abs(this.goals - this.goals_allowed);
    }

    /**
     * Returns a String that represents the Object and its values.
     */
    @Override
    public String toString() {
        return "Football [Team=" + this.team
        + ", Games=" + this.games
        + ", Wins=" + this.wins
        + ", Losses=" + this.losses
        + ", Draws=" + this.draws
        + ", Goals=" + this.goals
        + ", Goals Allowed=" + this.goals_allowed
        + ", Points=" + this.points
        + "]";
    }

    public String getTeam() {
        return team;
    }
}
