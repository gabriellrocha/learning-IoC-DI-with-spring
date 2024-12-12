package org.gabriel.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Contextualizando - A ideia aqui é que seja um Dev que construa coisas e dependa de ferramentas para isso

@Component
public class Developer {

    @Autowired                           // injeção de dependência - field injection
    private Computer computer;           // se não informar ao Spring, essa dependência será null

    // Como o Spring sabe a classe correta para fazer a injeção?? Pelo TIPO, não pelo nome



//    @Autowired                            constructor injection
//    public Developer(Laptop laptop){      default - não exige uso explícito do @Autowired em classes que tem apenas um construtor
//        this.laptop = laptop;
//    }


    public void build() {

        computer.compile();
        System.out.println("Working on Awesome Project");
    }

//    @Autowired
//    public void setLaptop(Laptop laptop){     setter injection
//        this.laptop = laptop;
//    }
}
