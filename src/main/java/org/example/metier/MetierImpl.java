package org.example.metier;


import org.example.dao.DataImpl;
import org.example.dao.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements IMetier{


    @Autowired
    @Qualifier("data")
    private IData datacall;
    @Override
    public double calcul() {
        double data = datacall.getData();
        double result = data * 15.6;
        return result;
    }
    public void setDatacall(DataImpl datacall) {
        this.datacall = datacall;
    }
}
