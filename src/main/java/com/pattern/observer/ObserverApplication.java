package com.pattern.observer;

import com.pattern.observer.model.Estoque;
import com.pattern.observer.model.Gerente;

import java.math.BigDecimal;

public class ObserverApplication {
    public static void main (String[] args){
        Runnable SpringApplication;
        SpringApplication.run(ObserverApplication.class, args);

        BigDecimal valorInicial = new BigDecimal("1100.00");
        BigDecimal desconto = BigDecimal("10.00");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiste");
        estoque.attach(gerente);
        BigDecimal ValorInicial;
        estoque.setValor(ValorInicial);
    }
}
