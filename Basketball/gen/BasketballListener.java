// Generated from /Users/andrew/Documents/Languague structures/cos382LanguageStructs/Basketball/Basketball.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link BasketballParser#shot}.
	 * @param ctx the parse tree
	 */
	void enterShot(BasketballParser.ShotContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#shot}.
	 * @param ctx the parse tree
	 */
	void exitShot(BasketballParser.ShotContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#rebound}.
	 * @param ctx the parse tree
	 */
	void enterRebound(BasketballParser.ReboundContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#rebound}.
	 * @param ctx the parse tree
	 */
	void exitRebound(BasketballParser.ReboundContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#assist}.
	 * @param ctx the parse tree
	 */
	void enterAssist(BasketballParser.AssistContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#assist}.
	 * @param ctx the parse tree
	 */
	void exitAssist(BasketballParser.AssistContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#assistAtt}.
	 * @param ctx the parse tree
	 */
	void enterAssistAtt(BasketballParser.AssistAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#assistAtt}.
	 * @param ctx the parse tree
	 */
	void exitAssistAtt(BasketballParser.AssistAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(BasketballParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(BasketballParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#turnover}.
	 * @param ctx the parse tree
	 */
	void enterTurnover(BasketballParser.TurnoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#turnover}.
	 * @param ctx the parse tree
	 */
	void exitTurnover(BasketballParser.TurnoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#foul}.
	 * @param ctx the parse tree
	 */
	void enterFoul(BasketballParser.FoulContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#foul}.
	 * @param ctx the parse tree
	 */
	void exitFoul(BasketballParser.FoulContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#freethrow}.
	 * @param ctx the parse tree
	 */
	void enterFreethrow(BasketballParser.FreethrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#freethrow}.
	 * @param ctx the parse tree
	 */
	void exitFreethrow(BasketballParser.FreethrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasketballParser#quarter}.
	 * @param ctx the parse tree
	 */
	void enterQuarter(BasketballParser.QuarterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasketballParser#quarter}.
	 * @param ctx the parse tree
	 */
	void exitQuarter(BasketballParser.QuarterContext ctx);
}