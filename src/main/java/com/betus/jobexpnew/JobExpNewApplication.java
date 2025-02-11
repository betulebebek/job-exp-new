package com.betus.jobexpnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobExpNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobExpNewApplication.class, args);
    }


}
