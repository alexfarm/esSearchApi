import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.*;
import org.elasticsearch.common.settings.Settings;
import org.junit.Test;

/**
 * Created by alex on 19/12/8.
 */
public class ESTest {

    /**
     * 数据查询
     */
    @Test
    public void test1() throws Exception {
        //指定ES集群
        Settings setting = Settings.builder().put("cluster.name",
                "elasticsearch_alex").build();

        //创建访问ES服务器的客户端
        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("127.0.0.1", 9200)));
        //get方式数据查询 ,参数为Index,type和id
        GetRequest request = new GetRequest("dialog123", "man", "s5BjwW4BdoPJ3lOOYRUA");
        GetResponse response = client.get(request, RequestOptions.DEFAULT);

        System.out.println(response.getSourceAsString());
        client.close();
    }
}
