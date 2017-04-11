package Player;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Player {
    private String yearId;
    private String teamId;
    private String lgId;
    private String playerId;
    private int salary;

    public Player() {
    }

    public Player(String yearId, String teamId, String lgId, String playerId, int salary) {
        this.yearId = yearId;
        this.teamId = teamId;
        this.lgId = lgId;
        this.playerId = playerId;
        this.salary = salary;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getLgId() {
        return lgId;
    }

    public void setLgId(String lgId) {
        this.lgId = lgId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "yearId='" + yearId + '\'' +
                ", teamId='" + teamId + '\'' +
                ", lgId='" + lgId + '\'' +
                ", playerId='" + playerId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
