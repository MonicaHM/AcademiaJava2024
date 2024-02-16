package com.curso.junit;

public class Main {

    public static void main(String[] args) {

        System.out.println( "Resultado: " +
                new CompositeMultiplication(
                        new CompositeAddition(
                                new Leaf(2.0),
                                new Leaf(3.0)
                        ),
                        new CompositeSubtraction(
                                new Leaf(4.0),
                                new CompositeDivision(
                                        new Leaf(12.0),
                                        new Leaf(6.0)
                                )
                        )
                ).execute()
        );
    }
}