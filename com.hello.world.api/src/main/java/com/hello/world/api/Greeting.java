package com.hello.world.api;

import com.hello.world.api.utils.GreetingUtils;

public interface Greeting {

    String planet();

    default void greeting(String name) {
        GreetingUtils.defaultGreeting(planet(), name);
    }

}
