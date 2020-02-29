// Generated from /Users/alex/alexRepo/esSearchApi/src/main/webapp/TestC.g4 by ANTLR 4.8

  package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestCParser}.
 */
public interface TestCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(TestCParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(TestCParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoleExpression(TestCParser.RoleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoleExpression(TestCParser.RoleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(TestCParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(TestCParser.AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(TestCParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(TestCParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(TestCParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(TestCParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(TestCParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(TestCParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparatorExpression(TestCParser.ComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link TestCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparatorExpression(TestCParser.ComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(TestCParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(TestCParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(TestCParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(TestCParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(TestCParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(TestCParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(TestCParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(TestCParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(TestCParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(TestCParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(TestCParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(TestCParser.NotContext ctx);
}