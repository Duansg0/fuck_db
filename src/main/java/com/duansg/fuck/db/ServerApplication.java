package com.duansg.fuck.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ServerApplication
 *
 * @author Duansg
 * @version 1.0
 * @date 2020/12/10 下午9:36
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.duansg.fuck.*.dao"})
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class);
    }
}
