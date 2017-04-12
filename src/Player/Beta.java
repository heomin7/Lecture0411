package Player;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Beta {
    private String yearId;
    private long averageOfSalary;

    public Beta() {
    }

    public Beta(String yearId, long averageOfSalary) {
        this.yearId = yearId;
        this.averageOfSalary = averageOfSalary;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public long getAverageOfSalary() {
        return averageOfSalary;
    }

    public void setAverageOfSalary(long averageOfSalary) {
        this.averageOfSalary = averageOfSalary;
    }

    @Override
    public String toString() {
        return "Beta{" +
                "yearId='" + yearId + '\'' +
                ", averageOfSalary=" + averageOfSalary +
                '}';
    }
}


