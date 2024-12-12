package org.gabriel.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("This Desktop says: Compiling with 404 bugs but fast");

    }

    // Duas classes (Desktop e Laptop) são 'Computer', como o Spring sabe com qual deve fazer DI?
    // @Primary indica qual o Bean deve ser priorizado em situações de conflito
}
