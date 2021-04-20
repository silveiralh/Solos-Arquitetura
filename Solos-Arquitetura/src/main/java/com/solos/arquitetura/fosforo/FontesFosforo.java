/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.fosforo;

/**
 *
 * @author Rique
 */

public enum FontesFosforo {
    SUPERFOSFATO_SIMPLES(18.0,0.28,"CÁLCIO",0.1,"Enxofre"),
    SUPERFOSFATO_TRIPLO(41.0,0.2,"CÁLCIO",0.0,""),
    MAP(48.0,0.09,"NITROGÊNIO",0.0,""),
    DAP(45.0,0.16,"NITROGÊNIO",0.0,""),
    YOORIN(18.0,0.28,"CÁLCIO",0.15,"ENXOFRE"),
    FOSFATO_ARAD(33.0,0.52,"CÁLCIO",0.0,""),
    FOSFATO_GAFSA(29.0,0.52,"CÁLCIO",0.0,""),
    FOSFATO_DAOUI(32.0,0.45,"CÁLCIO",0.0,""),
    FOSFATO_PATO_MINAS(24.0,0.28,"CÁLCIO",0.0,""),
    ESCORIA_DE_THOMAS(18.5,0.44,"CÁLCIO",0.0,""),
    ACIDO_FOSFORICO(52.0,0.0,"",0.0,""),
    MULTIF_MAGNESIANO(18.0,0.18,"CÁLCIO",0.11,"ENXOFRE");
    
    private final double valorFonteFosforo;
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

    public double getValorFonteFosforo() {
        return valorFonteFosforo;
    }
    
    FontesFosforo(double valorFonteFosforo, double campoCorrecaoUm, String campoCorrecaoDois, double campoCorrecaoTres, String campoCorrecaoQuatro){
        this.valorFonteFosforo = valorFonteFosforo;
        this.campoCorrecaoUm = campoCorrecaoUm;
        this.campoCorrecaoDois = campoCorrecaoDois;
        this.campoCorrecaoTres = campoCorrecaoTres;
        this.campoCorrecaoQuatro = campoCorrecaoQuatro;
    }
    
}
