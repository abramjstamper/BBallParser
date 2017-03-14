// Generated from /Users/abramjstamper/Documents/Junior Year/2nd Semester/COS382/cos382LanguageStructs/ANTLR/Basketball.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by {@link BasketballParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(BasketballParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BasketballParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(BasketballParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BasketballParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#factors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactors(BasketballParser.FactorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BasketballParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(BasketballParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasketballParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(BasketballParser.IdContext ctx);
}