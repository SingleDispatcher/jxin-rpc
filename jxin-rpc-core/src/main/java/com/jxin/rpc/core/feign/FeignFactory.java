package com.jxin.rpc.core.feign;

import com.jxin.rpc.core.call.Sender;

/**
 * 桩(装)的工厂类
 * @author 蔡佳新
 * @version 1.0
 * @since jdk 1.8
 */
public interface FeignFactory {
    <T> T createFeign(Sender sender, T insterface);
}
