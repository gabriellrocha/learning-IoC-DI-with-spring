package org.gabriel.myApp;

import org.springframework.stereotype.Component;

@Component
public class Developer {

    public void build() {
        System.out.println("Working on Awesome Project");
    }


    // A ideia aqui é que seja um Dev que construa coisas e dependa de ferramentas para isso
}
