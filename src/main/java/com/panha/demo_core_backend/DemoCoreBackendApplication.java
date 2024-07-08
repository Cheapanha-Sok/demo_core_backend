package com.panha.demo_core_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoCoreBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCoreBackendApplication.class, args);
    }

}
