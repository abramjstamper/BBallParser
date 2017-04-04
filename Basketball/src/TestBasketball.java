import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBasketball {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(new File("test.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        String[] arr = lines.toArray(new String[0]);

        for(String item : arr){
            ANTLRInputStream input = new ANTLRInputStream(item);
            BasketballLexer lexer = new BasketballLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BasketballParser parser = new BasketballParser(tokens);
            parser.start();
        }
    };
}