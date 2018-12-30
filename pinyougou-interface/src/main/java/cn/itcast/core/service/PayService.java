package cn.itcast.core.service;

import java.util.Map;

public interface PayService {

    //远程调用腾讯那边服务器
    public Map<String,String> createNative(String name);

    Map<String,String> queryPayStatus(String out_trade_no);
     /**
     * 关闭微信订单
     * @param outTradeNo 订单编号
     * @return 返回结果
     */
    Map<String, String> closeOrder(String outTradeNo);
}
