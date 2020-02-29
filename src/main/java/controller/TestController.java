package controller;

import es.ExpressionErrorListener;
import esUtil.EsUtil;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import antlr.*;

/**
 * Created by alex on 2020/2/4.
 */
@Controller
public class TestController {
    private static EsUtil esUtil = new EsUtil();

    private static BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();

    @RequestMapping(value = "/searchText", method = RequestMethod.GET)
    @ResponseBody
    public String searchText(String text) throws Exception {
        TestCLexer lexer = new TestCLexer(new ANTLRInputStream(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TestCParser parser = new TestCParser(tokens);
        parser.addErrorListener(ExpressionErrorListener.INSTANCE);
        TestCParser.ExpressionContext t = parser.expression();
        //获得语法树
        boolQueryBuilder.must(getAtomNode(t));
        //进行搜索
        return esUtil.boolQueryList(boolQueryBuilder);
    }

    private static QueryBuilder getAtomNode(ParseTree node) {
        BoolQueryBuilder b = new BoolQueryBuilder();
        if (node instanceof TestCParser.BinaryExpressionContext) {
            ParseTree op = ((TestCParser.BinaryExpressionContext) node).op;
            //布尔表达式则取左右两侧的比较表达式
            QueryBuilder q1 = getAtomNode(node.getChild(0));
            QueryBuilder q2 = getAtomNode(node.getChild(2));
            //此处规则应该通过op-switch进行比较
            //boolQueryBuilder.must(q1).must(q2);
            b = QueryBuilders.boolQuery().must(q1).must(q2);
        }
        if (node instanceof TestCParser.ComparatorExpressionContext) {
            return handleComparatorExpression(node);
        }
        return b;
    }

    /**
     * 处理最基本的比较表达式
     *
     * @param node
     */
    private static QueryBuilder handleComparatorExpression(ParseTree node) {
        ParseTree left = node.getChild(0);
        ParseTree right = node.getChild(2);
        //生成基础查询
        QueryBuilder queryBuilder = QueryBuilders.termQuery(left.getChild(0).getChild(0).toString(), right.getChild(0).getChild(0).toString());
        return queryBuilder;
    }
}
