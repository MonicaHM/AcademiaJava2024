package com.curso.junit;

public class CompositeMultiplication implements Component {
    Component componentLeft;
    Component componentRight;

    public CompositeMultiplication(Component componentLeft, Component componentRight) {
        this.componentLeft = componentLeft;
        this.componentRight = componentRight;
    }

    @Override
    public double execute() {
        return componentLeft.execute() * componentRight.execute();
    }
}
