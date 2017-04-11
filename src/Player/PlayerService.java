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

    public double getAllplayersAverageSalary(List<Player> list){

        Beta bt = new Beta();

        long sum = 0;
        int count = 0;

        List<Beta> yearList = new ArrayList<>();
        String oldYear = null;
        for (Player e: list){

            if(!e.getYearId().equals(oldYear)){
                yearList.add(new Beta(e.getYearId(), sum/count));
                oldYear = e.getYearId();
                count = 0;
                sum = 0;
            }
            sum += e.getSalary();
            count++;

        }


 /*
        String compStr = yearList.get(0).getYearId();
        for(Beta e: yearList){
            if(e.getYearId().equals(compStr)){
                sum +=
            }
        }


 */
        for(Beta e: yearList){
            System.out.println(e.getYearId());
            System.out.println(e.getSumOfSalary());
            System.out.println();
        }


        return 0.0;
    }
}
