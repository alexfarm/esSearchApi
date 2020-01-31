package controller;

import es.ESQueryBuilderConstructor;
import es.ESQueryBuilders;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import util.EsUtil;

/**
 * Created by alex on 2020/1/28.
 */
public class TestController {

    private static EsUtil esUtil = new EsUtil();

    public static void main(String[] args) throws Exception {
        String ret = boolQuery("消卡");
        System.out.println();
    }

    public static String queryDocument(String id) throws Exception {
        String ret = esUtil.queryDocument(id);
        return ret;
    }

    public static String boolQuery(String text) throws Exception {
        return esUtil.boolQuery(text);
    }

    public static void conditionsQuery() throws Exception {
        ESQueryBuilderConstructor constructor = new ESQueryBuilderConstructor();
        constructor.must(new ESQueryBuilders().term("gender", "f").range("age", 20, 50));
        constructor.should(new ESQueryBuilders().term("gender", "f").range("age", 20, 50).fuzzy("age", 20));
        constructor.mustNot(new ESQueryBuilders().term("gender", "m"));
        constructor.setSize(15);  //查询返回条数，最大 10000
        constructor.setFrom(11);  //分页查询条目起始位置， 默认0
        constructor.setAsc("age"); //排序
    }

}
