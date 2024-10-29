package org.example.presentation;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
        IMetier metier = (IMetier) applicationContext.getBean("metier");
        System.out.println(metier.calcul());
    }
}
