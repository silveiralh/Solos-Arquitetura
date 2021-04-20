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
    CLORETO_DE_POTASSIO(58,0.0,"",0.0,""),
    SULFATO_DE_POTASSIO(52,0.17,"ENXOFRE",0.0,""),
    SULFATO_POTASSIO_MAGNESIO(22,0.22,"ENXOFRE",0.18,"MAGNÉSIO");
    
    private final double valorFontePotassio;
    private final double campoCorrecaoUm;
    private final String campoCorrecaoDois;
    private final double campoCorrecaoTres;
    private final String campoCorrecaoQuatro;

    public double getCampoCorrecaoUm() {
        return campoCorrecaoUm;
    }

    public String getCampoCorrecaoDois() {
        return campoCorrecaoDois;
    }

    public double getCampoCorrecaoTres() {
        return campoCorrecaoTres;
    }

    public String getCampoCorrecaoQuatro() {
        return campoCorrecaoQuatro;
    }

    public double getValorFontePotassio() {
        return valorFontePotassio;
    }
    
    FontesPotassio(double valorFontesPotassio, double campoCorrecaoUm, String campoCorrecaoDois, double campoCorrecaoTres, String campoCorrecaoQuatro){
        this.valorFontePotassio=valorFontesPotassio;
        this.campoCorrecaoUm = campoCorrecaoUm;
        this.campoCorrecaoDois = campoCorrecaoDois;
        this.campoCorrecaoTres = campoCorrecaoTres;
        this.campoCorrecaoQuatro = campoCorrecaoQuatro;
    }
}