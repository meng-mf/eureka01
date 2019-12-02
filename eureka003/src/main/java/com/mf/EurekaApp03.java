package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApp03
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/2
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp03 {
    public static void main(String[] args){

        SpringApplication.run(EurekaApp03.class,args);

    }
}
