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

    Hashtable<Integer, Integer> homeTeamFreeThrow = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamFreeThrow = new Hashtable<>();

    @Override
    public void exitFreethrow(BasketballParser.FreethrowContext ctx) {

        String tempParse = ctx.player().getText();
        int playerNum = Integer.parseInt(tempParse.substring(1));
        if (tempParse.substring(0, 1).equals("M")) {
            homeTeamFreeThrow.putIfAbsent(playerNum, 0);
            int nextFoulNum = homeTeamFreeThrow.get(playerNum) + 1;
            homeTeamFreeThrow.put(playerNum, nextFoulNum);
            if (homeTeamFreeThrow.get(playerNum) > 1)
                System.out.println("Home Player " + playerNum + " has " + homeTeamFreeThrow.get(playerNum) + " freethrows.");
        } else {
            guestTeamFreeThrow.putIfAbsent(playerNum, 0);
            int nextFoulNum = guestTeamFreeThrow.get(playerNum) + 1;
            guestTeamFreeThrow.put(playerNum, nextFoulNum);
            if (guestTeamFreeThrow.get(playerNum) > 1)
                System.out.println("Guest Player " + playerNum + " has " + guestTeamFreeThrow.get(playerNum) + " freethrows.");
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

    public ArrayList<Integer> getHomePlayers(){
        Bag<Integer> homePlayers = new Bag<>();

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
        for(int player: homeTeamFreeThrow.keySet()){
            homePlayers.add(player);
        }
        ArrayList<Integer> players = new ArrayList<>();

        for(int player: homePlayers){
            players.add(player);
        }

        return players;
    }
    public ArrayList<Integer> getAwayPlayers(){
        Bag<Integer> awayPlayers = new Bag<>();

        for (int player: guestTeamShotsMade.keySet()) {
            awayPlayers.add(player);
        }
        for (int player: guestTeamShotsMissed.keySet()) {
            awayPlayers.add(player);
        }
        for (int player: guestTeamAssists.keySet()){
            awayPlayers.add(player);
        }
        for(int player: guestTeamFouls.keySet()){
            awayPlayers.add(player);
        }

        for(int player: guestTeamFreeThrow.keySet()){
            awayPlayers.add(player);
        }
        ArrayList<Integer> players = new ArrayList<>();

        for(int player: awayPlayers){
            players.add(player);
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
        ArrayList<Integer> awayPlayers = getAwayPlayers();
        ArrayList<Integer> homePlayers = getHomePlayers();

        System.out.println("Away Team Statistics");
        System.out.println(" P | MA   MS   FTA   FTM   RB   A   F");
        for(int i = 0; i < awayPlayers.size(); i++){
            String printText = " " + awayPlayers.get(i) + " | " + nullToZero(guestTeamShotsMade.get(awayPlayers.get(i))) + "   " + nullToZero(guestTeamShotsMissed.get(awayPlayers.get(i))) + "   " + nullToZero(guestTeamFreeThrow.get(awayPlayers.get(i)))+ "   " + nullToZero(guestTeamAssists.get(awayPlayers.get(i))) + "   " + nullToZero(guestTeamFouls.get(awayPlayers.get(i)));
            System.out.print(printText);
            System.out.println();
        }

        System.out.println("Home Team Statistics");
        for(int i = 0; i < homePlayers.size(); i++){
            String printText = " " + homePlayers.get(i) + " | " + nullToZero(homeTeamShotsMade.get(awayPlayers.get(i))) + "   " + nullToZero(homeTeamShotsMissed.get(awayPlayers.get(i))) + "   "+ nullToZero(homeTeamFreeThrow.get(awayPlayers.get(i)))+ "   " + nullToZero(homeTeamAssists.get(awayPlayers.get(i))) + "   " + nullToZero(homeTeamFouls.get(awayPlayers.get(i)));
            System.out.print(printText);
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Basktball Statistic Computer");
        //TODO: fix this so it throws exception without arguments
        if(args[0] == null){
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

        test.prettyPrint();
    }
}