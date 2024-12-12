package org.gabriel.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile() {
        System.out.println("This laptop says: Compiling with 404 bugs");
    }

}
