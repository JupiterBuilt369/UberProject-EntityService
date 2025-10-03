package org.example.uberprojectentityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
public class UberProjectEntityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberProjectEntityServiceApplication.class, args);
        System.out.println("<------------JAI-SHREE-RAM----------------->");
    }

}
