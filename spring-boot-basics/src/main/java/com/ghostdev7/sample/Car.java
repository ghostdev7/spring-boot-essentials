package com.ghostdev7.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol engine stopped");
    }
}

@Component
class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }

    @Override
    public void stop() {
        System.out.println("Diesel engine stopped");
    }
}

@Component
public class Car {
    private final Engine engine;

    public Car(@Qualifier("dieselEngine") Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        this.engine.start();
        System.out.println("Car is driving");
    }
}
