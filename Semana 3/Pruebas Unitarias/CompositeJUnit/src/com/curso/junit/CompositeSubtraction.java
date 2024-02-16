package com.curso.junit;

public class CompositeSubtraction implements Component {
    Component componentLeft;
    Component componentRight;

    public CompositeSubtraction(Component componentLeft, Component componentRight) {
        this.componentLeft = componentLeft;
        this.componentRight = componentRight;
    }

    @Override
    public double execute() {
        return componentLeft.execute() - componentRight.execute();
    }
}
