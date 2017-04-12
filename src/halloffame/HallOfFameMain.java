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
        //0. read file
        BufferedReader br = new BufferedReader(new FileReader("src\\HallOfFame.csv"));

        String line ="";
        List<HallOfFame> halls = new ArrayList<>();

        br.readLine();

        //1. 원본 파일 생성
        while((line = br.readLine()) != null){

            String[] splitted = line.split(",");
/*
//3항 연산자 형태(공백 입력 유효성 검사)
            int ballots = (splitted[3].equals("")) ? 0 : Integer.parseInt(splitted[3]);
            int needed = (splitted[4].equals("")) ? 0 : Integer.parseInt(splitted[4]);
            int votes = (splitted[5].equals("")) ? 0 : Integer.parseInt(splitted[5]);
            halls.add(new HallOfFame(splitted[0].replace("", " "), ballots, needed, votes));
*/

//함수 만들어서 하는 형태(공백 입력 유효성 검사)
            HallOfFame fame = new HallOfFame();
            splitted[0].replace("", " ");
            fame.setPlayerId(splitted[0]);
            fame.setBallots(NullUtil.parseInt(splitted[3]));
            fame.setNeeded(NullUtil.parseInt(splitted[4]));
            fame.setVotes(NullUtil.parseInt(splitted[5]));
            halls.add(fame);


        }


        List<PlayerAverage> newList = new ArrayList<>();

        //2. mapping 작업
        for(HallOfFame e: halls){
            PlayerAverage pa = new PlayerAverage();
            pa.setPlayerId(e.getPlayerId());
            pa.setAverage(
                    (e.getBallots() + e.getNeeded() + e.getVotes()) / 3);
            newList.add(pa);
        }

 //       System.out.println(newList.size());
 //       System.out.println(newList.get(1999));

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
