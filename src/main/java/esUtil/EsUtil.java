package esUtil;

import es.EsOperation;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.WrapperQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.List;

/**
 * Created by alex on 2020/2/4.
 */
public class EsUtil {

    private static RestHighLevelClient client;

    public EsUtil() {
        EsOperation esOperation = new EsOperation();
        client = esOperation.getEsOperation();
    }

    public static String queryDocument(String id) throws Exception {
        GetRequest getRequest = new GetRequest("test");
        getRequest.type("_doc");
        getRequest.id(id);
        GetResponse getResponse =client.get(getRequest, RequestOptions.DEFAULT);
        return getResponse.toString();
    }

    public static String boolQuery(QueryBuilder queryBuilder) throws Exception {
        SearchRequest searchRequest = new SearchRequest("test");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchRequest.types("_doc");
        searchRequest.source(searchSourceBuilder);
        searchSourceBuilder.query(queryBuilder);

        SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        return searchResponse.toString();
    }

    public static String boolQueryList(BoolQueryBuilder builder) throws Exception {
        SearchRequest searchRequest = new SearchRequest("test");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchRequest.types("_doc");
        searchRequest.source(searchSourceBuilder);
        searchSourceBuilder.query(builder);
        SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        return searchResponse.toString();
    }

    /**
     * ex:{"bool":{"must":[{"match":{"text":"刷卡"}}],"must_not":[],"should":[]}}
     * @param text
     * @return
     * @throws Exception
     */
    public static String dslQuery(String text) throws Exception {
        WrapperQueryBuilder wrapperQueryBuilder = QueryBuilders.wrapperQuery(text);
        SearchRequest searchRequest = new SearchRequest("test");
        searchRequest.types("_doc");

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(wrapperQueryBuilder);
        searchRequest.source(searchSourceBuilder);
        SearchResponse searchResponse = client.search(searchRequest,RequestOptions.DEFAULT);
        return searchResponse.toString();
    }

    public static QueryBuilder addMustQuery(String key, String value) throws Exception {
        QueryBuilder queryBuilder = QueryBuilders.termQuery(key, value);
        return queryBuilder;
    }
}
