import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Hashtable;

public class TestBasketball extends BasketballBaseListener{

    boolean[] homePlayers = new boolean[100];
    boolean[] guestPlayers = new boolean[100];

    Hashtable<Integer, Integer> homeTeamShotsMade = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamShotsMade = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamShotsMissed = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamShotsMissed = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamAssists = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamAssists = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamFouls = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamFouls = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamFreeThrowAttempt = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamFreeThrowAttempt = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamFreeThrowMade = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamFreeThrowMade = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamRebounds = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamRebounds = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamTurnover = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamTurnover = new Hashtable<>();

    Hashtable<Integer, Integer> homeTeamSteal = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamSteal = new Hashtable<>();
    @Override
    public void exitTurnover(BasketballParser.TurnoverContext ctx){
        String tempParse = ctx.player(0).getText();
        int playerNum = Integer.parseInt(tempParse.substring(1));
        if (tempParse.substring(0, 1).equals("h")) {
            if(ctx.getText().substring(0,1) == "t"){
                homeTeamTurnover.putIfAbsent(playerNum, 0);
                int nextTurnoverNum = homeTeamTurnover.get(playerNum) + 1;
                homeTeamTurnover.put(playerNum, nextTurnoverNum);
            }
        } else {
                guestTeamTurnover.putIfAbsent(playerNum, 0);
                int nextAwayTurnoverNum = guestTeamTurnover.get(playerNum) + 1;
                guestTeamTurnover.put(playerNum, nextAwayTurnoverNum);
        }

        //Steals
        if(ctx.player(1) != null){
            String stealPlayer = ctx.player(1).getText();
            if (tempParse.substring(0, 1).equals("h")) {
                if(ctx.getText().substring(0,1) == "t"){
                    homeTeamSteal.putIfAbsent(playerNum, 0);
                    int nextTurnoverNum = homeTeamSteal.get(playerNum) + 1;
                    homeTeamSteal.put(playerNum, nextTurnoverNum);
                }
            } else {
                guestTeamSteal.putIfAbsent(playerNum, 0);
                int nextAwayTurnoverNum = guestTeamSteal.get(playerNum) + 1;
                guestTeamSteal.put(playerNum, nextAwayTurnoverNum);
            }
        }
    }

    @Override
    public void exitFreethrow(BasketballParser.FreethrowContext ctx) {
        String tempParse = ctx.player().getText();
        int playerNum = Integer.parseInt(tempParse.substring(1));
        if (tempParse.substring(0, 1).equals("h")) {
            if(ctx.getText().substring(0,1) == "m"){
                homeTeamFreeThrowMade.putIfAbsent(playerNum, 0);
                int nextFreeThrowNum = homeTeamFreeThrowMade.get(playerNum) + 1;
                homeTeamFreeThrowMade.put(playerNum, nextFreeThrowNum);
            } else {
                homeTeamFreeThrowAttempt.putIfAbsent(playerNum, 0);
                int nextFreeThrowNum = homeTeamFreeThrowAttempt.get(playerNum) + 1;
                homeTeamFreeThrowAttempt.put(playerNum, nextFreeThrowNum);
            }
        } else {
            if(ctx.getText().substring(0,1) == "m"){
                guestTeamFreeThrowMade.putIfAbsent(playerNum, 0);
                int nextFoulNum = guestTeamFreeThrowMade.get(playerNum) + 1;
                guestTeamFreeThrowMade.put(playerNum, nextFoulNum);
            } else {
                guestTeamFreeThrowAttempt.putIfAbsent(playerNum, 0);
                int nextFoulNum = guestTeamFreeThrowAttempt.get(playerNum) + 1;
                guestTeamFreeThrowAttempt.put(playerNum, nextFoulNum);
            }
        }
    }
    @Override
    public void exitFoul(BasketballParser.FoulContext ctx) {
        String tempParse = ctx.player().getText();
        int playerNum = Integer.parseInt(tempParse.substring(1));
        if (tempParse.substring(0, 1).equals("h")) {
            homeTeamFouls.putIfAbsent(playerNum, 0);
            int nextFoulNum = homeTeamFouls.get(playerNum) + 1;
            homeTeamFouls.put(playerNum, nextFoulNum);
            if (homeTeamFouls.get(playerNum) > 4)
                System.out.println("WARN: Home Player " + playerNum + " has " + homeTeamFouls.get(playerNum) + " fouls.");
        } else {
            guestTeamFouls.putIfAbsent(playerNum, 0);
            int nextFoulNum = guestTeamFouls.get(playerNum) + 1;
            guestTeamFouls.put(playerNum, nextFoulNum);
            if (guestTeamFouls.get(playerNum) > 4)
                System.out.println("WARN: Guest Player " + playerNum + " has " + guestTeamFouls.get(playerNum) + " fouls.");
        }
    }

    @Override
    public void exitPlayer(BasketballParser.PlayerContext ctx) {
        if(ctx.getText().substring(0,1).equals("h"))
            homePlayers[Integer.parseInt(ctx.NUMBER().getText())] = true;
        else
            guestPlayers[Integer.parseInt(ctx.NUMBER().getText())] = true;
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

        int reboundNum = -1;
        if(ctx.rebound() != null) {
            reboundNum = Integer.parseInt(ctx.rebound().getText().substring(1));
            if(ctx.rebound().player().getText().substring(0, 1).equals('h')){
                homeTeamRebounds.putIfAbsent(player, 0);
                homeTeamRebounds.put(reboundNum, homeTeamRebounds.get(player) + 1);
            } else {
                guestTeamRebounds.putIfAbsent(player, 0);
                guestTeamRebounds.put(reboundNum, guestTeamRebounds.get(player) + 1);
            }
        }

    }

    public ArrayList<Integer> getHomePlayers(){
        ArrayList<Integer> players = new ArrayList<>();
        for(int i = 0; i < homePlayers.length; i++){
            if(homePlayers[i] == true)
                players.add(i);
        }
        return players;
    }
    public ArrayList<Integer> getGuestPlayers(){
        ArrayList<Integer> players = new ArrayList<>();
        for(int i = 0; i < guestPlayers.length; i++){
            if(guestPlayers[i] == true)
                players.add(i);
        }
        return players;
    }



    public int nullToZero(Integer i){
        if(i == null){
            return 0;
        }
        else {
            return i;
        }
    }

    public void prettyPrint(){
        System.out.println("\nGame Statistics");
        ArrayList<Integer> awayPlayers = getGuestPlayers();
        ArrayList<Integer> homePlayers = getHomePlayers();

        System.out.println("Away Team Statistics");
        System.out.println(" P  | MA   MS   FTA   FTM   RB    A    F    T    S");
        System.out.println("---------------------------------------------------");
        for(int i = 0; i < awayPlayers.size(); i++){
            String printText = String.format(" %2d | %2d   %2d   %2d    %2d    %2d   %2d   %2d   %2d   %2d", awayPlayers.get(i), nullToZero(guestTeamShotsMade.get(awayPlayers.get(i))),  nullToZero(guestTeamShotsMissed.get(awayPlayers.get(i))), nullToZero(guestTeamFreeThrowAttempt.get(awayPlayers.get(i))), nullToZero(guestTeamFreeThrowMade.get(awayPlayers.get(i))), nullToZero(guestTeamRebounds.get(awayPlayers.get(i))), nullToZero(guestTeamAssists.get(awayPlayers.get(i))), nullToZero(guestTeamFouls.get(awayPlayers.get(i))), nullToZero(guestTeamTurnover.get(awayPlayers.get(i))), nullToZero(guestTeamSteal.get(awayPlayers.get(i))));
            System.out.print(printText);
            System.out.println();
        }

        System.out.println("");
        System.out.println("Home Team Statistics");
        System.out.println(" P  | MA   MS   FTA   FTM   RB    A    F    T    S");
        System.out.println("---------------------------------------------------");
        for(int i = 0; i < homePlayers.size(); i++){
            String printText = String.format(" %2d | %2d   %2d   %2d    %2d    %2d   %2d   %2d   %2d   %2d", homePlayers.get(i), nullToZero(homeTeamShotsMade.get(homePlayers.get(i))), nullToZero(homeTeamShotsMissed.get(homePlayers.get(i))), nullToZero(homeTeamFreeThrowAttempt.get(homePlayers.get(i))), nullToZero(homeTeamFreeThrowMade.get(homePlayers.get(i))), nullToZero(homeTeamRebounds.get(homePlayers.get(i))), nullToZero(homeTeamAssists.get(homePlayers.get(i))), nullToZero(homeTeamFouls.get(homePlayers.get(i))), nullToZero(homeTeamTurnover.get(homePlayers.get(i))), nullToZero(homeTeamSteal.get(awayPlayers.get(i))));
            System.out.print(printText);
            System.out.println();
        }
        System.out.println("End Game Statistics");
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Basktball Statistic Computer");
        if(args.length == 0){
            System.out.println("Error! Missing game file argument");
            System.exit(0);
        } else {
            System.out.println("Read in file " + args[0] + " for processing.");
        }
        System.out.println();

        FileInputStream inputStream = new FileInputStream("test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        BasketballLexer lexer = new BasketballLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasketballParser parser = new BasketballParser(tokens);

        TestBasketball test = new TestBasketball();
        parser.addParseListener(test);
        parser.start();
        System.out.println("Finished Parsing file");

        test.prettyPrint();
    }
}