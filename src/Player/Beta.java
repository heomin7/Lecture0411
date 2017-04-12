package Player;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Beta {
    private String yearId;
    private long sumOfSalary;

    public Beta() {
    }

    public Beta(String yearId) {
        this.yearId = yearId;
    }

    public Beta(long sumOfSalary) {
        this.sumOfSalary = sumOfSalary;
    }

    public Beta(String yearId, long sumOfSalary) {
        this.yearId = yearId;
        this.sumOfSalary = sumOfSalary;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public long getSumOfSalary() {
        return sumOfSalary;
    }

    public void setSumOfSalary(long sumOfSalary) {
        this.sumOfSalary = sumOfSalary;
    }

    @Override
    public String toString() {
        return "Beta{" +
                "yearId='" + yearId + '\'' +
                ", sumOfSalary=" + sumOfSalary +
                '}';
    }
}


