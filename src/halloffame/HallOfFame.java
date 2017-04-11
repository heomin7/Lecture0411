package halloffame;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFame {
    private String playerId;
    private int ballots;
    private int needed;
    private int votes;

    public HallOfFame() {
    }

    public HallOfFame(String playerId, int ballots, int needed, int votes) {
        this.playerId = playerId;
        this.ballots = ballots;
        this.needed = needed;
        this.votes = votes;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getBallots() {
        return ballots;
    }

    public void setBallots(int ballots) {
        this.ballots = ballots;
    }

    public int getNeeded() {
        return needed;
    }

    public void setNeeded(int needed) {
        this.needed = needed;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }


}
