package com.regent.rbp.lcn;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagerServer
public class CloudLcnApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudLcnApplication.class, args);
    }

}
