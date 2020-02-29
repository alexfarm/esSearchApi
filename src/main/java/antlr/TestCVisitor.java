// Generated from /Users/alex/alexRepo/esSearchApi/src/main/webapp/TestC.g4 by ANTLR 4.8

  package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(TestCParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roleExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleExpression(TestCParser.RoleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpression(TestCParser.AtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(TestCParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(TestCParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(TestCParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(TestCParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(TestCParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(TestCParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(TestCParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(TestCParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(TestCParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(TestCParser.NotContext ctx);
}