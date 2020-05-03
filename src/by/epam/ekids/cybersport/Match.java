package by.epam.ekids.cybersport;

import java.util.List;

public class Match {
    private List<Player> team1;
    private List<Player> team2;

    public Match(List<Player> team1, List<Player> team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public List<Player> getTeam1() {
        return team1;
    }

    public void setTeam1(List<Player> team1) {
        this.team1 = team1;
    }

    public List<Player> getTeam2() {
        return team2;
    }

    public void setTeam2(List<Player> team2) {
        this.team2 = team2;
    }
}
