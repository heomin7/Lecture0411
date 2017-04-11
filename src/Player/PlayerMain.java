package Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerMain {
    public static void main(String[] args)throws Exception{

        //1. data loading from csv
        BufferedReader br = new BufferedReader(
                new FileReader("src\\Salaries.csv"));

        List<Player> players = new ArrayList<>();
        String line = "";

        br.readLine();  //skip the first line
        while((line = br.readLine()) != null){
           String[] splitted = line.split(",");
           players.add(new Player(splitted[0], splitted[1], splitted[2],
                   splitted[3], Integer.parseInt(splitted[4])));

        }

        // 2. 현재 데이터를 분석해서 결론을 도출
        // 2.1 최대값 구하기(Reducing)

        PlayerService service = new PlayerService();
        Player player = service.getHighestSalaryPlayer(players);
        System.out.printf("%s 의 연봉은 %d불 입니다.\n",
                player.getPlayerId(), player.getSalary());

        //System.out.println(player.toString());
        System.out.println(player);


        //2.2 최소값 구하기
        Player player1 = service.getLowestSalaryPlayer(players);
        System.out.printf("%s 의 연봉은 %d불 입니다.\n",
                player1.getPlayerId(), player1.getSalary());

        //2.3 평균
        double averageSalary = service.getAllplayersAverageSalary(players);



    }
}
