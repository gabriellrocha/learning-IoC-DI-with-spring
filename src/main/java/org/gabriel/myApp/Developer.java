package org.gabriel.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Contextualizando - A ideia aqui é que seja um Dev que construa coisas e dependa de ferramentas para isso

@Component
public class Developer {

    @Autowired                           // injeção de dependência - field injection
    private Laptop laptop;              // se não informar ao Spring, essa dependência será null


//    @Autowired                            constructor injection
//    public Developer(Laptop laptop){      default - não exige uso explícito do @Autowired em classes que tem apenas um construtor
//        this.laptop = laptop;
//    }


    public void build() {

        laptop.compile();
        System.out.println("Working on Awesome Project");
    }

//    @Autowired
//    public void setLaptop(Laptop laptop){     setter injection
//        this.laptop = laptop;
//    }
}
