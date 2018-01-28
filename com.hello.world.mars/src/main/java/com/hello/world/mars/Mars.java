package com.hello.world.mars;

import com.hello.world.api.Greeting;

public class Mars implements Greeting {

    @Override
    public String planet() {
        return "Mars";
    }
}