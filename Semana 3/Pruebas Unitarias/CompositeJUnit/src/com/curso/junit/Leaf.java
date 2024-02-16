package com.curso.junit;

public class Leaf implements Component {
    private final double constant;

    public Leaf(double constant) {
        this.constant = constant;
    }

    @Override
    public double execute() {
        return constant;
    }
}
