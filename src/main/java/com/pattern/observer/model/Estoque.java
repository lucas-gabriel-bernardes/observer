package com.pattern.observer.model;

import com.pattern.observer.observer.Observer;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Estoque {

    private String produto;
    private BigDecimal valor
    private BigDecimal desconto;
    private List<Observer> observers = new ArrayList<Observer>();

    public Estoque(BigDecimal desconto, BigDecimal valor, String produto) {
        this.desconto = desconto;
        this.valor = valor;
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
        notifyObserver();
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){
        for (Observer observer: observers){
            observer.update(this);
        }
    }
}

