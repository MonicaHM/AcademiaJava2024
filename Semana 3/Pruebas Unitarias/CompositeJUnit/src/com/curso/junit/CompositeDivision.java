package com.curso.junit;

public class CompositeDivision implements Component {
    Component componentLeft;
    Component componentRight;

    public CompositeDivision(Component componentLeft, Component componentRight) {
        this.componentLeft = componentLeft;
        this.componentRight = componentRight;
    }

    @Override
    public double execute() {
        return componentLeft.execute() / componentRight.execute();
    }
}
