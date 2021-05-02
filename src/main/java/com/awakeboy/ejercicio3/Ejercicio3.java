package com.awakeboy.ejercicio3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {

    final static Logger LOGGER = LogManager.getLogger(Ejercicio3.class);
    private static int i =0;

    public static void main(String[] args) {
        LOGGER.info("Inicio del programa");
        method();
    }

    private static void method(){
        int op = 4/0;
        System.out.println(op);
    }
}
