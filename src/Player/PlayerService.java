package Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerService {
    public Player getHighestSalaryPlayer(List<Player> list){

        Player highestSalaryPlayer = new Player();

        for(Player e: list){
            if(e.getSalary() > highestSalaryPlayer.getSalary()){
                highestSalaryPlayer = e;
            }
        }

        return highestSalaryPlayer;
    }

    public Player getLowestSalaryPlayer(List<Player> list){

        Player LowestSalaryPlayer = list.get(0);

        for(Player e: list){
            if(e.getSalary() < LowestSalaryPlayer.getSalary()){
                LowestSalaryPlayer = e;
            }
        }

        return LowestSalaryPlayer;
    }

    public List<Beta> getAllplayersAverageSalary(List<Player> list){

        Beta bt = new Beta();

        long sum = 0;
        int count = 0;

        List<Beta> yearList = new ArrayList<>();
        String oldYear = list.get(0).getYearId();

        for(Player e: list){
            if(!e.getYearId().equals(oldYear)){
                yearList.add(new Beta(oldYear, (sum/count)));
                sum = 0;
                count = 0;
                oldYear = e.getYearId();
            }
            sum += e.getSalary();
            count++;
        }
        yearList.add(new Beta(oldYear, (sum/count)));

        return yearList;
    }
}
