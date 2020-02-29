package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class TestController {
    public static void main(String[] args) {
        String s = "name = ljh AND age = 18 OR location = sh AND bbb NEAR uuu";
        TestCLexer lexer = new TestCLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TestCParser parser = new TestCParser(tokens);
        TestCParser.ExpressionContext t = parser.expression();

        getAtomNode(t);

        System.out.println(t.toStringTree(parser));
    }

    private static void getAtomNode(ParseTree node) {
        if (node instanceof TestCParser.BinaryExpressionContext) {
            ParseTree op = ((TestCParser.BinaryExpressionContext) node).op;
            System.out.println(op.getChild(0).toString());
        }
        if(node instanceof TestCParser.ComparatorExpressionContext){
            handleComparatorExpression(node);
        }
        if (node instanceof TerminalNodeImpl) {
            //System.out.println(node);
        } else {
            int i = node.getChildCount();
            for (int n = 0; n < i; n++) {
                ParseTree t = node.getChild(n);
                getAtomNode(t);
            }
        }
    }

    /**
     * 处理最基本的比较表达式
     * @param node
     */
    private static void handleComparatorExpression(ParseTree node) {
        StringBuilder builder = new StringBuilder();
        ParseTree left = node.getChild(0);
        ParseTree op = node.getChild(1);
        ParseTree right = node.getChild(2);

        builder.append(left.getChild(0).getChild(0).toString()).append(op.getChild(0).toString()).append(right
        .getChild(0).getChild(0).toString());
        System.out.println(builder);
    }
}
