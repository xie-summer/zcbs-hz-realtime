package com.zcbspay.platform.hz.realtime.business.message.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.zcbspay.platform.hz.realtime.business.message.BaseTest;
import com.zcbspay.platform.hz.realtime.message.bean.CMS900Bean;

public class TestDao extends BaseTest {

    @Autowired
    private TChnCollectSingleLogDAO tChnCollectSingleLogDAO;
    @Autowired
    private TChnPaymentSingleLogDAO tChnPaymentSingleLogDAO;

    @Test
    public void testAll() {
        long currentTime = System.currentTimeMillis();
        updateRealPaymentLogCommResp();
        System.out.println("excute time:" + (System.currentTimeMillis() - currentTime));
    }

    private void updateRealCollectLogCommResp() {
        String json = "{\"MsgId\":\"20170405128724\",\"OrgnlMsgId\":{\"OrgnlMsgId\":\"2017040500000106\",\"OrgnlMsgType\":\"CMS900\",\"OrgnlSender\":\"XXXXXXXXXX\"},\"RspnInf\":{\"NetgDt\":\"20170405\",\"RjctCd\":\"I000\",\"RjctInf\":\"处理成功\",\"Sts\":\"S\"}}";
        CMS900Bean bean = JSONObject.parseObject(json, CMS900Bean.class);
        tChnCollectSingleLogDAO.updateRealCollectLogCommResp(bean);

    }

    private void updateRealPaymentLogCommResp() {
        String json = "{\"MsgId\":\"20170405128724\",\"OrgnlMsgId\":{\"OrgnlMsgId\":\"2017040500000106\",\"OrgnlMsgType\":\"CMS900\",\"OrgnlSender\":\"XXXXXXXXXX\"},\"RspnInf\":{\"NetgDt\":\"20170405\",\"RjctCd\":\"I000\",\"RjctInf\":\"处理成功\",\"Sts\":\"S\"}}";
        CMS900Bean bean = JSONObject.parseObject(json, CMS900Bean.class);
        tChnPaymentSingleLogDAO.updateRealPaymentLogCommResp(bean);
    }

}
