package controller;

import esUtil.EsUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alex on 2020/2/4.
 */
@Controller
public class TestController {
    private static EsUtil esUtil = new EsUtil();

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(String id) throws Exception {
        return esUtil.boolQuery("我");
    }
}
