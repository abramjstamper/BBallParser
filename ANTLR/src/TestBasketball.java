import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class TestBasketball {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);

        //ANTLRInputStream input = new ANTLRInputStream(System.in);

        BasketballLexer lexer = new BasketballLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasketballParser parser = new BasketballParser(tokens);
        parser.start(); // parse the input stream starting at rule s
    };
}