package com.spring.microservicesExampleProject.Bean;

public class Limits {

    private int minimum;
    private int maximum;

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public Limits() {
    }

    public Limits(int minimum, int maximum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }
}
