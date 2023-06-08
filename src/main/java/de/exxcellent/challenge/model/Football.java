package de.exxcellent.challenge.model;

/**
 * Class represents one football team.
 *
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class Football extends Data {
    private String team;
    private int games;
    private int wins;
    private int losses;
    private int draws;
    private int goals;
    private int goals_allowed;
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
}
