// Generated from /Users/abramjstamper/Documents/Junior Year/2nd Semester/COS382/cos382LanguageStructs/ANTLR/Basketball.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasketballParser}.
 */
public interface BasketballListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasketballParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(BasketballParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(BasketballParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(BasketballParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(BasketballParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BasketballParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BasketballParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(BasketballParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(BasketballParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BasketballParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BasketballParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#factors}.
	 * @param ctx the parse tree
	 */
	void enterFactors(BasketballParser.FactorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#factors}.
	 * @param ctx the parse tree
	 */
	void exitFactors(BasketballParser.FactorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(BasketballParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(BasketballParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(BasketballParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(BasketballParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(BasketballParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(BasketballParser.IdContext ctx);
}