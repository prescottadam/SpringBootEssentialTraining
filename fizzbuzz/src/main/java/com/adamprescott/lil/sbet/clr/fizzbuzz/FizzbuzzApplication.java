package com.adamprescott.lil.sbet.clr.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzbuzzApplication {
    private static final Logger LOG = LoggerFactory.getLogger(FizzbuzzApplication.class);

    @Bean
    public CommandLineRunner run() {
        return args -> {
            LOG.info("Starting CLR application");

            for (int i=1; i<=100; i++) {
                String result = "";
                result += (i % 3) == 0 ? "Fizz" : "";
                result += (i % 5) == 0 ? "Buzz" : "";
                System.out.println(!result.isEmpty() ? result : i);
            }

            LOG.info("Finishing CLR application");
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(FizzbuzzApplication.class, args);
    }

}
