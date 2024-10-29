package org.example.dao;

import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData {


    @Override
    public double getData() {
        System.out.println("Recuperation de la Base de donnes ");
        double data = 10;
        return data;
    }
}
