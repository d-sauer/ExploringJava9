package com.hello.world;

import com.hello.world.api.Greeting;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        Iterable<Greeting> load = ServiceLoader.load(Greeting.class);

        load.forEach(greeting -> {
            String greetingClassName = greeting.getClass().getName();
            System.out.println("Greetings: " + greetingClassName);
            greeting.greeting("Davor");
        });
    }


}