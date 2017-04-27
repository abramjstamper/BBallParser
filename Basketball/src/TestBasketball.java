import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.io.FileInputStream;
import java.util.Hashtable;

public class TestBasketball extends BasketballBaseListener{

    Hashtable<Integer, Integer> homeTeamFouls = new Hashtable<>();
    Hashtable<Integer, Integer> guestTeamFouls = new Hashtable<>();

    @Override
    public void exitFoul(BasketballParser.FoulContext ctx) {
        System.out.println("test");
        String[] tempParse = ctx.getText().split("\\s+");
        String playerNum = tempParse[1].substring(1);
        if (tempParse[1].substring(0, 1) == "H") {
            int nextFoulNum = homeTeamFouls.get(playerNum) + 1;
            homeTeamFouls.put(Integer.parseInt(playerNum), nextFoulNum);
            if (guestTeamFouls.get(playerNum) > 5)
                System.out.println("Player Number: " + guestTeamFouls.get(playerNum));
        } else {
            int nextFoulNum = guestTeamFouls.get(playerNum) + 1;
            guestTeamFouls.put(Integer.parseInt(playerNum), nextFoulNum);
            if (guestTeamFouls.get(playerNum) > 5)
                System.out.println("Player Number: " + guestTeamFouls.get(playerNum));
        }
    }
//    public void printFouls(int numFoulsPerGame){
//        numFoulsPerGame--;
//        for(int i : homeTeamFouls.keySet()){
//            if(homeTeamFouls.get(i) > numFoulsPerGame)
//                System.out.println("Player Number: " + numFoulsPerGame);
//        }
//        for(int i : guestTeamFouls.keySet()){
//            if(guestTeamFouls.get(i) > numFoulsPerGame)
//                System.out.println("Player Number: " + numFoulsPerGame);
//        }
//    }

    public static void main(String[] args) throws Exception {

        System.out.println("test main");

        FileInputStream inputStream = new FileInputStream("test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        BasketballLexer lexer = new BasketballLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasketballParser parser = new BasketballParser(tokens);

        TestBasketball test = new TestBasketball();
        parser.addParseListener(test);
        parser.start();

    }

    ;
}