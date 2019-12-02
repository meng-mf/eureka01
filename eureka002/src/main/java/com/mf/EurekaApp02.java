package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * @ClassName EurekaApp02
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/2
 * @Version V1.0
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class EurekaApp02 {
    public static void main(String[] args){

        SpringApplication.run(EurekaApp02.class,args);

    }
}
