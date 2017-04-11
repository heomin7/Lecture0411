package halloffame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFameMain {
    public static void main(String[] args) throws Exception{
        //1. read file
        BufferedReader br = new BufferedReader(new FileReader("src\\HallOfFame.csv"));

        String line ="";
        List<HallOfFame> halls = new ArrayList<>();

        br.readLine();

        while((line = br.readLine()) != null){

            String[] splitted = line.split(",");

            int ballots = (splitted[3].equals("")) ? 0 : Integer.parseInt(splitted[3]);
            int needed = (splitted[4].equals("")) ? 0 : Integer.parseInt(splitted[4]);
            int votes = (splitted[5].equals("")) ? 0 : Integer.parseInt(splitted[5]);
            halls.add(new HallOfFame(splitted[0], ballots, needed, votes));
        }


        List<PlayerAverage> newList = new ArrayList<>();

        //mapping 작업
        PlayerAverage pa = new PlayerAverage();
        for(HallOfFame e: halls){
            pa = new PlayerAverage();
            pa.setPlayerId(e.getPlayerId());
            pa.setAverage(
                    (e.getBallots() + e.getNeeded() + e.getVotes()) / 3);
            newList.add(pa);
        }

        for(PlayerAverage e: newList){
            System.out.println("playerId: " + e.getPlayerId());
            System.out.println("average: " + e.getAverage());
            System.out.println();
        }
    }
}

/*
1. PlayAverage
 - play_Id
 - average
=> 각 player의 3개 숫자(ballots, needed, votes)의 평균


 */
