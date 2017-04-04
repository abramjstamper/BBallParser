// Generated from /Users/andrew/Documents/Languague structures/cos382LanguageStructs/Basketball/Basketball.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasketballParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasketballVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BasketballParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(BasketballParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#shot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShot(BasketballParser.ShotContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#rebound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRebound(BasketballParser.ReboundContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#assist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssist(BasketballParser.AssistContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#assistAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssistAtt(BasketballParser.AssistAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#player}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer(BasketballParser.PlayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#turnover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnover(BasketballParser.TurnoverContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#foul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoul(BasketballParser.FoulContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#freethrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreethrow(BasketballParser.FreethrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#quarter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuarter(BasketballParser.QuarterContext ctx);
}