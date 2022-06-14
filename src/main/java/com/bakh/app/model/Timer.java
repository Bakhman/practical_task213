package com.bakh.app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer extends Animal {

    private final Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

    @Override
    public String toString() {
        return String.format("Timer[ nanoTime=%d ]", nanoTime);
    }
}
