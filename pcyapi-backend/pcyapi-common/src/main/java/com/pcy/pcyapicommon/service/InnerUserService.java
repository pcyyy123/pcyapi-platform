package com.pcy.pcyapicommon.service;


import com.pcy.pcyapicommon.model.entity.User;

/**
 * 内部用户服务
 *
 * @author pcy
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
