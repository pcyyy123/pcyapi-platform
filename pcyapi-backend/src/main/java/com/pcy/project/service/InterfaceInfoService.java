package com.pcy.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pcy.pcyapicommon.model.entity.InterfaceInfo;

/**
* @author pcy
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-10-09 13:35:28
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
