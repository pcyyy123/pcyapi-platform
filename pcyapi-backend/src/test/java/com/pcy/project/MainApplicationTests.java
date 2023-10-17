package com.pcy.project;

import com.pcy.project.service.UserInterfaceInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 主类测试
 *
 * @author pcy
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@SpringBootTest
class MainApplicationTests {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void incokeCount(){
        boolean b = userInterfaceInfoService.invokeCount(1L, 1711284872661778435L);
        Assertions.assertTrue(b);
    }




}
