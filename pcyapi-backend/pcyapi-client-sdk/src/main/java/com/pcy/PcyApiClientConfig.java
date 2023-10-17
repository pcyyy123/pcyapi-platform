package com.pcy;

import com.pcy.client.PcyApiClient;
import com.pcy.model.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("pcyapi.client")
@Data
@ComponentScan
public class PcyApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public PcyApiClient pcyApiClient(){
        return new PcyApiClient(accessKey,secretKey);
    }

}
