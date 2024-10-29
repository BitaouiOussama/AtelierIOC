package org.example.dao;


import org.springframework.stereotype.Component;

@Component("dataext")
public class DataImplExt implements IData{
    @Override
    public double getData() {
        System.out.println("Recuperation de la Base de donnes ");
        double data = 20;
        return data;
    }
}
