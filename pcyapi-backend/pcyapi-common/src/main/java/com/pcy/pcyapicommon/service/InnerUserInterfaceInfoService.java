package com.pcy.pcyapicommon.service;

/**
 * 内部用户接口信息服务
 *
 * @author pcy
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
