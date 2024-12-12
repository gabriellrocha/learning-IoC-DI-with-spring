package org.gabriel.myApp;

public interface Computer {

    void compile();

    // Programe para Interface

    // Deixa o código menos acoplado, pois:
    // Não dependemos de Implementações
    // O código fica mais flexível e mudanças


    // Contextualizando
    /* Dependa do Computer ao invés do Laptop, pois se depois precisar fazer a mudança para um desktop
    *  será mais simples, e não 'quebrará' todoo o código - basta fazer a referência*/

}
