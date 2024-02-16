package com.curso.junit;

public class CompositeAddition implements Component {
    Component componentLeft;
    Component componentRight;

    public CompositeAddition(Component componentLeft, Component componentRight) {
        this.componentLeft = componentLeft;
        this.componentRight = componentRight;
    }

    @Override
    public double execute() {
        return componentLeft.execute() + componentRight.execute();
    }
}
