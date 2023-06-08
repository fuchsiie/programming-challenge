package de.exxcellent.challenge.model;

public class Football extends Data {
    private String team;
    private int games;
    private int wins;
    private int losses;
    private int draws;
    private int goals;
    private int goals_allowed;
    private int points;

    public int calcDeltaGoals() {
        return Math.abs(this.goals - this.goals_allowed);
    }

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
