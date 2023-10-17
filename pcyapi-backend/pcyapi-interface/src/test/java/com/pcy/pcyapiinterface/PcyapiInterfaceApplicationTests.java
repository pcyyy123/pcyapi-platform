package com.pcy.pcyapiinterface;

import com.pcy.client.PcyApiClient;
import com.pcy.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class PcyapiInterfaceApplicationTests {

    @Resource
    private PcyApiClient pcyApiClient;

    @Test
    void contextLoads() {
        String zs = pcyApiClient.getNameByGet("zs");
        User user = new User();
        user.setUsername("llls");
        String usernameByPost = pcyApiClient.getUsernameByPost(user);
        System.out.println(zs);
        System.out.println(usernameByPost);

    }

}
