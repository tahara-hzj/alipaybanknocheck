package com.example.alipaybanknocheck.controller;

import com.example.alipaybanknocheck.common.Config;
import com.example.alipaybanknocheck.util.HttpUtils;
import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  Jello
 * @create  2018/6/23 15:09
 * @desc    银行卡四要素实名认证数据请求层
 **/

@Controller
public class BankNoCheckController {
    Logger logger = LoggerFactory.getLogger(BankNoCheckController.class);

    @GetMapping("/queryBankNoCheck")
    @ResponseBody
    public String queryBankNoCheck(){
        Map<String, String> headers = new HashMap<String, String>(16);
        //在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization","APPCODE " + Config.appCode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>(16);
        Map<String, String> bodys = new HashMap<String, String>(16);

        bodys.put("ReturnBankInfo", "YES");
        bodys.put("cardNo", "6217280332902326703");
        bodys.put("idNo", "350823199402161018");
        bodys.put("name", "胡志俊");
        bodys.put("phoneNo", "18839797532");
        try {
            HttpResponse response = HttpUtils.doPost(Config.host, Config.path, Config.method, headers, querys, bodys);
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            logger.info("银行卡四要素实名认证数据请求层异常" + e.getMessage());
            return null;
        }
    }

}
