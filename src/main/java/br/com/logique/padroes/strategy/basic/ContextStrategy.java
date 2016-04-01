package br.com.logique.padroes.strategy.basic;

import br.com.logique.padroes.strategy.Strategy;

/**
 * Contexto que usar� a estrat�gia para realizar c�lculo/processamento.
 * Created by Gustavo on 01/04/2016.
 */
public class ContextStrategy {

    private Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doIt(){
        System.out.println("Result: "+strategy.doSomething());
    }

}
