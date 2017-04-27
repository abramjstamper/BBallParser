import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Hashtable;

public class TestBasketball extends BasketballBaseListener{

    Hashtable<Integer, Integer> homeTeamShotsMade = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamShotsMade = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamShotsMissed = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamShotsMissed = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamAssists = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamAssists = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamFouls = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamFouls = new Hashtable<>();

    @Override
    public void exitFoul(BasketballParser.FoulContext ctx) {
        String tempParse = ctx.player().getText();
        int playerNum = Integer.parseInt(tempParse.substring(1));
        if (tempParse.substring(0, 1).equals("h")) {
            homeTeamFouls.putIfAbsent(playerNum, 0);
            int nextFoulNum = homeTeamFouls.get(playerNum) + 1;
            homeTeamFouls.put(playerNum, nextFoulNum);
            if (homeTeamFouls.get(playerNum) > 4)
                System.out.println("Home Player " + playerNum + " has " + homeTeamFouls.get(playerNum) + " fouls.");
        } else {
            guestTeamFouls.putIfAbsent(playerNum, 0);
            int nextFoulNum = guestTeamFouls.get(playerNum) + 1;
            guestTeamFouls.put(playerNum, nextFoulNum);
            if (guestTeamFouls.get(playerNum) > 4)
                System.out.println("Guest Player " + playerNum + " has " + guestTeamFouls.get(playerNum) + " fouls.");
        }
    }

    @Override
    public void exitShot(BasketballParser.ShotContext ctx) {

        int player = Integer.parseInt(ctx.player().getText().substring(1));

        if (ctx.getText().charAt(3) == 'm') {
            //this is a made shot
            if (ctx.player().getText().substring(0, 1).equals('h')) {
                homeTeamShotsMade.putIfAbsent(player, 0);
                homeTeamShotsMade.put(player, homeTeamShotsMade.get(player) + Integer.parseInt(ctx.getText().substring(0, 1)));
            } else {
                guestTeamShotsMade.putIfAbsent(player, 0);
                guestTeamShotsMade.put(player, guestTeamShotsMade.get(player) + Integer.parseInt(ctx.getText().substring(0, 1)));
            }
        } else {
            //this is a missed shot
            if (!ctx.player().getText().substring(0, 1).equals('h')) {
                guestTeamShotsMissed.putIfAbsent(player, 0);
                guestTeamShotsMissed.put(player, guestTeamShotsMissed.get(player) + Integer.parseInt(ctx.getText().substring(0, 1)));
            } else {
                homeTeamShotsMissed.putIfAbsent(player, 0);
                homeTeamShotsMissed.put(player, homeTeamShotsMissed.get(player) + Integer.parseInt(ctx.getText().substring(0, 1)));
            }
        }

        int assistNum = -1;
        if(ctx.assist() != null) {
            assistNum = Integer.parseInt(ctx.assist().getText().substring(1));
            if(ctx.player().getText().substring(0, 1).equals('h')){
                homeTeamAssists.putIfAbsent(player, 0);
                homeTeamAssists.put(assistNum, homeTeamAssists.get(player) + 1);
            } else {
                guestTeamAssists.putIfAbsent(player, 0);
                guestTeamAssists.put(assistNum, guestTeamAssists.get(player) + 1);
            }
        }
    }

    public void prettyPrint(){
        Bag<Integer> homePlayers = new Bag<>();
        Bag<Integer> guestPlayers = new Bag<>();

        for (int player: homeTeamShotsMade.keySet()) {
            homePlayers.add(player);
        }
        for (int player: homeTeamShotsMissed.keySet()) {
            homePlayers.add(player);
        }
        for (int player: homeTeamAssists.keySet()){
            homePlayers.add(player);
        }
        for(int player: homeTeamFouls.keySet()){
            homePlayers.add(player);
        }

        for(int player: homePlayers){
            System.out.println(player);
        }



    }

    public static void main(String[] args) throws Exception {

        System.out.println("Basktball Statistic Computer");
        System.out.println();

        if(args[0] == null){
            System.out.println("Error! Missing game file argument");
            System.exit(0);
        } else {
            System.out.println("Read in file " + args[0] + " for processing.");
        }

        FileInputStream inputStream = new FileInputStream("test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        BasketballLexer lexer = new BasketballLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasketballParser parser = new BasketballParser(tokens);

        TestBasketball test = new TestBasketball();
        parser.addParseListener(test);
        parser.start();

        test.prettyPrint();
    }
}