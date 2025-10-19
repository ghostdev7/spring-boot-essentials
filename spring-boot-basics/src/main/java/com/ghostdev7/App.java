package com.ghostdev7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ghostdev7.sample.Car;

@SpringBootApplication
public class App implements CommandLineRunner {

    private Car car;

    public App(Car car) {
        this.car = car;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        this.car.drive();
    }
}

// Spring Boot automatically does this (internally):
// 1. Creates ApplicationContext
// 2. Scans for @Component, @Service, @Repository, @Controller
// 3. Configures DataSource (if database dependency is present)
// 4. Configures JdbcTemplate (if needed)
// 5. Configures ViewResolver
// 6. Starts embedded Tomcat on port 8080
// 7. Loads all beans
