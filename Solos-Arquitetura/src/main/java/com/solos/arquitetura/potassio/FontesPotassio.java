/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.potassio;

/**
 *
 * @author Rique
 */
public enum FontesPotassio {
    CLORETO_DE_POTASSIO(58.0),
    SULFATO_DE_POTASSIO(52.0),
    SULFATO_POTASSIO_MAGNESIO(22.0);
    
    private final double valorFontePotassio;

    public double getValorFontePotassio() {
        return valorFontePotassio;
    }
    
    FontesPotassio(double valorFontesPotassio){
        this.valorFontePotassio=valorFontesPotassio;
    }
}